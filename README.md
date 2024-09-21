# Exemplo de Padrão Singleton

Este projeto é um exemplo de aplicação do padrão de design **Singleton** em Java. O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.

## Estrutura do Código

O código é composto pela seguinte classe:

1. **PrintManager**: Implementa o padrão Singleton para gerenciar uma fila de impressão. Possui métodos para adicionar documentos à fila e para imprimir todos os documentos na fila. Garante que apenas uma instância do `PrintManager` exista.

### Métodos da Classe

- **getInstance()**: Retorna a instância única do `PrintManager`. Se a instância ainda não existir, cria uma nova. É um método `synchronized` para garantir que a criação da instância seja segura em ambientes multi-thread.

- **addJob(String document)**: Adiciona um documento à fila de impressão e exibe uma mensagem indicando que o documento foi adicionado.

- **printAll()**: Imprime todos os documentos na fila e em seguida limpa a fila.

- **main(String[] args)**: Função principal que demonstra o uso do `PrintManager`. Adiciona alguns documentos à fila e os imprime.

## Como Utilizar

1. **Obtenha a instância única do `PrintManager`**:
   ```java
   PrintManager printManager = PrintManager.getInstance();
2. **Adicione documentos à fila de impressão:**
   ```java
   printManager.addJob("Documento 1");
   printManager.addJob("Documento 2");
3. **Imprima todos os documentos na fila:**
   ```java
   printManager.printAll();

## Exemplo de execução 
Quando o código é executado, a saída será:
    
    ```java
    printManager.printAll();


