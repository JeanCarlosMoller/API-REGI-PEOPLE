# Sistema de Verificação - Clientes VIP

## Descrição

Este sistema consiste em uma integração entre uma API Java desenvolvida com o Spring Framework no qual são armazenadas no banco de dados MySQL e um script em PHP. Ele permite a verificação se um cliente é VIP ou não com base no CPF fornecido durante uma chamada telefônica.

## Componentes

- **API Java (Spring Framework)**
  - Desenvolvida em Java com o Spring Framework.
  - Responsável por gerenciar dados de clientes e determinar se são VIPs.
  
- **Script PHP**
  - Responsável por integrar com a API Java.
  - Recebe o CPF digitado durante uma chamada telefônica e faz a requisição à API Java para verificar o status do cliente.
  
- **Central Telefônica**
  - Os clientes interagem com o sistema através da central telefônica.
  - O sistema pede o CPF do cliente durante a chamada.
  - Com base na resposta da API e do script PHP, encaminha o cliente para a URA apropriada.

## Funcionamento

1. O cliente liga para o número 5000.
2. A central telefônica solicita o CPF.
3. O cliente digita o CPF usando o teclado do telefone (DTMF).
4. O script PHP recebe o CPF e faz uma requisição à API Java.
5. A API Java verifica se o CPF é válido e se o cliente é VIP.
6. Com base na resposta da API, o script PHP instrui a central telefônica a encaminhar o cliente para a URA apropriada.

### Configuração do Banco de Dados MySQL:

O sistema requer um banco de dados MySQL para armazenar informações dos clientes.

## Configuração

- **Requisitos**:
  - [Java](https://www.java.com/)
  - [Spring Framework](https://spring.io/)
  - [PHP](https://www.php.net/)
  - [MySQL](https://www.mysql.com/)

- **Instalação**:
  1. Clone o repositório.
  2. Configure a API Java e o script PHP de acordo com as instruções no respectivo diretório.

## Uso

1. Inicie a API Java.
2. Configure o script PHP para se comunicar com a API (forneça o URL da API, por exemplo).
3. Inicie a central telefônica e teste o sistema.

##
![LabMoller (1) drawio](https://github.com/JeanCarlosMoller/API-REGI-PEOPLE/assets/11274857/00dd96d3-54f6-4729-a5d4-843a90c0b230)