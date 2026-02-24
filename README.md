# 💱 Conversor de Moedas API

API REST para conversão de moedas em tempo real utilizando cotações da AwesomeAPI. Projeto desenvolvido como desafio para o curso de Padrões de Projeto da DIO.

## 📋 Sobre o Projeto

Este projeto é uma API simples e eficiente que permite converter valores entre diferentes moedas utilizando cotações atualizadas. Foi desenvolvida com foco em simplicidade e boas práticas, aplicando padrões de projeto como Strategy, Facade e Singleton.

### ✨ Funcionalidades

- ✅ Conversão entre diferentes moedas (USD, EUR, BTC, GBP → BRL)
- ✅ Cotações em tempo real via AwesomeAPI
- ✅ Listagem de moedas suportadas
- ✅ Documentação interativa com Swagger
- ✅ Arquitetura limpa e de fácil entendimento

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 4.0.34**
- **Spring Cloud OpenFeign** - Cliente HTTP declarativo
- **Springdoc OpenAPI (Swagger)** - Documentação da API
- **Maven** - Gerenciamento de dependências
- **AwesomeAPI** - API gratuita de cotações

## 🎯 Padrões de Projeto Aplicados

| Padrão | Onde foi aplicado | Objetivo |
|:-------|:------------------|:---------|
| **Strategy** | Feign Client | Estratégia de comunicação com API externa |
| **Facade** | ConversorFacade | Simplifica a interface de conversão |
| **Singleton** | Services e Components | Garantido pelo Spring |

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven
- Git

### Passos

1. **Clone o repositório**
   ```bash
   git clone https://github.com/AndreTHFS/desafio-dio.git
   cd desafio-dio
