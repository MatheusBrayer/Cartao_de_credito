

```markdown
# Sistema de Cartão de Crédito

Projeto em Java que simula o funcionamento básico de um cartão de crédito, permitindo lançamentos de compras, consulta de saldo e listagem das compras realizadas.

---

## ✨ Funcionalidades

- Registro de compras com descrição e valor
- Verificação de limite disponível antes da compra
- Exibição do saldo atual do cartão
- Listagem das compras realizadas
- Interface de interação via console (menu textual)

---

## 🏗️ Estrutura do Projeto

```

src/
├── Principal.java
├── MenuPrincipal.java
├── CartaoDeCredito.java
└── Compras.java

````

- **Principal.java** → Classe de entrada do sistema (possui método `main`).
- **MenuPrincipal.java** → Interface textual que exibe o menu e recebe comandos do usuário.
- **CartaoDeCredito.java** → Representa o cartão, armazena limite, saldo e lista de compras.
- **Compras.java** → Entidade que representa cada compra (descrição e valor).

---

## 🚀 Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/SEU_USUARIO/sistema-cartao-credito.git
    ```

2. Importe o projeto em sua IDE de preferência (IntelliJ, Eclipse, VS Code etc.)

3. Compile e execute a classe `Principal.java`.

---

## ⚙️ Requisitos

- Java 17 ou superior
- Git

---

## 💻 Tecnologias

- Java (JDK)
- Programação Orientada a Objetos (POO)
- Coleções (List)

---

## 📚 Exemplo de Uso

Ao iniciar o programa, será exibido o seguinte menu:

````

MENU PRINCIPAL
1 - Realizar nova compra
2 - Consultar saldo
3 - Consultar lista de compras
4 - Sair

```

O usuário poderá cadastrar compras, consultar o saldo restante ou visualizar todas as compras feitas. Compras que excedam o limite disponível não serão aprovadas.

---

## 📝 Licença

Projeto disponibilizado para fins educativos e de aprendizado. Livre para uso pessoal e contribuições.

```

---


