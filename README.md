# Calculadora de IMC

Um aplicativo Android simples que calcula o Índice de Massa Corporal (IMC) e exibe o resultado.

## Conceitos de Kotlin

Este projeto demonstra os seguintes conceitos de Kotlin:

* **Classes e Objetos:** `MainActivity` e `ResultadoActivity` são classes que representam as telas do aplicativo.
* **Propriedades:** `btnCalcular`, `editPeso`, `textoResultado`, etc., são propriedades dasclasses que armazenam referências para os elementos da interface.
* **Funções:** `onCreate`, `setOnClickListener`, etc., são funções que definem o comportamento das telas.
* **Late-Initialized Properties:** `lateinit` permite inicializar propriedades não nulas posteriormente, geralmente no método `onCreate` de uma `Activity`.
* **String Templates:** `${}` permite interpolar variáveis dentro de strings.
* **Intents:** Usado para iniciar outra `Activity` e passar dados entre elas.
* **Bundles:** Usado para armazenar e passar dados entre `Activities`.

## Construção de Interface

* **Layouts:** O projeto usa arquivos XML para definir o layout das telas (`activity_main.xml` e `activity_resultado.xml`).
* **Widgets:** O projeto usa widgets como `EditText`, `Button` e `TextView` para criar a interface do usuário.
* **Edge-to-Edge:** O app utiliza `enableEdgeToEdge()` e `ViewCompat.setOnApplyWindowInsetsListener` para estender o conteúdo da tela até as bordas do dispositivo, proporcionando uma experiência imersiva.
* **Padding:**  Ajusta o padding do layout para acomodar as barras do sistema, garantindo que o conteúdo não seja obscurecido.
