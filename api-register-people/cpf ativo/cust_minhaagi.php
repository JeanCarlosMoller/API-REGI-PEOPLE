#!/usr/bin/php
<?php

set_time_limit(120);

require_once('phpagi.php');

$agi = new AGI();

//$cpf_dtmf = "12345678910";

$cpf_dtmf = $agi->get_variable("V_CPF")['data'];

function getData($agi, $cpf_dtmf){

    $url = "http://192.168.1.20:8080/pessoas/" . $cpf_dtmf;

    $ch = curl_init($url);

    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

    $resultado = json_decode(curl_exec($ch));

    curl_close($ch);

    $obj = new stdClass;

    $obj->dst_cpf = $resultado->cpf;
    $obj->dst_vip = $resultado->vip;

    return $obj;

}

function avalia($agi, $cpf_dtmf){

    $ret = getData($agi, $cpf_dtmf);

    $agi->verbose("$$$$$$$$$ CPF $$$$$$$$$$" . $ret->dst_cpf);
    $agi->verbose("$$$$$$$$$ VIP $$$$$$$$$$" . $ret->dst_vip);

    if ($ret->dst_cpf == $cpf_dtmf && $ret->dst_vip == "sim"){

        $agi->verbose($ret->dst_cpf);
        $agi->verbose($ret->dst_vip);
        $agi->set_variable("V_DESTINO", '1-URA-VIP,s,1');

    }else{

        $agi->set_variable("V_DESTINO", '1-URA-NAO-VIP,s,1');

    }
}
        
avalia($agi, $cpf_dtmf);

?>
