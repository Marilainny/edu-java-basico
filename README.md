<!-- Configuração do git README.md no site: https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax-->

# edu-java-basico
Repositório de código basico de java, de acesso público.
<h1>Anotações Gerais</h1>

<h2>Constantes</h2>
<p>Assinatura final, nome da constante usar letras Uppercase, pode declarar a contante como static</p>
<pre><code>final int DAYS_PER_WEEK = 7;</code></pre>
<pre><code>puclic class calendar{
    public static final int DAYS_PER_WEEK = 7;
    }</code></pre>

<h2>Enum</h2>
<p>Enum são objetos</p>
<pre><code>enum Weekday {MONDAY, TUESDAY, WENESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY};</code></pre>
<pre><code>Weekday startDay = Weekday.MODAY;</code></pre>

<h2>Basic Arithmetic</h2>
<p>Preste atenção ao usar calculos com inteiros</p>
<pre><code>17 / 5 é 3</code></pre>
<pre><code>17.0 / 5 é 3.4</code></pre>

<p>Um inteiro dividido por zero vai ocorrer uma Exception e parar seu programa.</p>
<p>Incrementar ++n é diferente de incrementar n++.</p>

<h2>Potência, raiz</h2>
<pre><code>Math.pow(x, y)</code></pre>
<pre><code>Math.sqrt(x)</code></pre>

<h2>Conversão char</h2>
<pre><code>'J' + 1 = 75</code></pre>
<p>O valor de 'J' é 74</p>

<h2>Cast operador</h2>
<pre><code>
    double x = 3.75
    int n = (int) x;        
</code></pre>
<p>Neste exemplo o valor será arredondado</p>
<pre><code>int n = (int) Math.round(x);</code></pre>
<pre><code>
    int n = 1;
    char next = (char) ('J'+ n); //converter 75 to 'K'.
</code></pre>

<h2>Operadores lógicos</h2>
<p>Evite Exception validando os valores zero</p>
<pre><code> n! = 0 && s + (100 -s) / n < 50</code></pre>
<pre><code> n == 0 || s + (100 -s) / n >= 50</code></pre>

<h2>Condição</h2>
<pre><code> time < 12 ? "am" : "pm"</code></pre>

<h2>Concatenação</h2>
<pre>
    <code>
    int age = 42;
    String output = age + " years.";
    --output: 42 years.
    </code>
</pre>
<pre>
    <code>
    "Next year, you will be " + age + 1 //Error
    "Next year, you will be " + (age + 1) //Ok
    </code>
</pre>

<p>Para combinar várias strings separadas com um delimitador use o join</p>
<pre>
    <code>
    String names = String.join(",", "Peter", "Paul", "Mary");
    // Sets names to "Peter, Paul, Mary";
    </code>
</pre>
<p>Concatenação em grande quantidade de strings use StringBuilder</p>
<pre>
    <code>
    StringBuilder builder = new StringBuilder();
    While(more strings){
        builder.append(next string);
    }
        String result = builder.toString();
    </code>
</pre>

<p>Para selecionar uma parte da string utilize o Substring</p>
<pre>
<code>
    String greeting = "Hello, World!";
    String location = greeting.substring(7,12);
    // Sets location to "World"
</code>
</pre>

<p>Use o método slipt para retornar um array de substrings</p>
<pre>
<code>
    String names = "Peter, Paul, Mary";
    String[] result = names.slipt(", ");
    // An array of three strings ["Peter", "Paul", "Mary"];
</code>
</pre>
<pre>
<code>
    input.split("\s+")
    //splits coloca um espaço em branco.
</code>
</pre>
<pre>
<code>
    String fraseComEspaco = "  Java java  ";
    fraseComEspaco.trim().length());
    //"Java java"
</code>
</pre>
<p>O método trim() remove o espaço em branco no ínicio e no final de uma string. Após feito isso, é chamado o método
    split() que retorna um array de String separando as palavras por espaço ou qualquer outro delimitador que vc
    preferir.</p>

<h2>Comparação de string</h2>
<p>Não use operador == para comparar strings.</p>
<pre>
<code>
    String location = greeting.substring(7, 12);
    location == "World" //locatin e World são o mesmo objeto na memoria
</code>
</pre>
<p> Nulo não é o mesmo que Vazio</p>
<pre>
<code>
    String middleName = null;
    if (middleName == null) ...
    "" //vazio
</code>
</pre>
<p>Um método nulo causa "null pointer exception". E finaliza o programa.</p>
<pre><code>
    if ("World".equals(localition))
    "world".equalsIgnoreCase(location);
    first.compareTo(second)
</code></pre>

<h2>Converter Inteiro em String</h2>
<pre><code>int n = 42;
    String str = Integer.toString(n);
    String str = "101010";   
    int n = Integer.parseInt(str);
</code></pre>

<h2>Scanner</h2>
<pre><code>Scanner in = new Scanner (System.in);
    System.out.println("What is your name?");
    String name = in.nextLine();
    System.out.println("How old are you?");
    int age = in.nextInt();
</code></pre>
<p>Para checar se tem outras linhas use.</p>
<pre><code>
    if(in.hasNextInt()){
        int age = in.nextInt();
    }
</code></pre>
<p>Para password use o console</p>
<pre><code>
    Console Terminal = System.console();
    String username = terminal.readLine("User name: ");
    char[] password = terminal.readPassword("Password: "");
</code></pre>

<h2>Formatar Output</h2>
<pre><code>System.out.printf("%8.2f, 1000.0/3");
    System.out.printf("Hello, %s. Next year, you'll be %d.\n", name, age);</code></pre>

<h2>Branches if e eslse</h2>
<pre><code>if (count > 0) {
    double average = sum / count;
    System.out.println(average);
    }</code></pre>

<pre><code>if (count > 0) {
    double average = sum / count;
    System.out.println(average);
    } else {
    System.out.println(0);
    }</code></pre>

<pre><code>if (count > 0) {
    double average = sum / count;
    System.out.println(average);
    } else if (count == 0) {
    System.out.println(0);
    } else {
    System.out.println("Huh?");}</code></pre>

<h2>Switch</h2>
<pre><code>switch (count) {
    case 0:
    output = "None";
    break;
    case 1:
    output = "One";
    break;
    case 2:
    case 3:
    case 4:
    case 5:
    output = Integer.toString(count);
    break;
    default:
    output = "Many";
    break;
    }</code></pre>

    <h2>Loops</h2>
<p>O loop While mantém executando até ser determinado uma condição.</p>
<pre><code>Random generator = new Random();
    int next = generator.nextInt(10);

    while (sum < target) {
        int next = generator.nextInt(10);
        sum += next;
        count++;
    }
</code></pre>

<h2>do/while loop</h2>
<pre><code>int next;
    do {
    next = generator.nextInt(10);
    count++;
    } while (next != target);
</code></pre>

<h2>for loop</h2>
<pre><code>for (int i = 1; i <= 20; i++) {
    int next = generator.nextInt(10);
    sum += next;
    }
</code></pre>
<p>Podemos reescrever o código equivalente</p>
<pre><code>int i = 1;
    while (i <= 20) {
    int next = generator.nextInt(10);
    sum += next;
    i++;
    }
</code></pre>

<h2>Inicialização da variavél</h2>
<pre><code>for (int i = 1; i < target; i *= 2) {
    System.out.println(i);
</code></pre>

<h2> Breaking and Continuing</h2>
<pre><code>boolean done = false;
    while (!done) {
    String input = in.next();
    if ("Q".equals(input)) {
    done = true;
    } else {
    Process input
    }
}</code></pre>
<p>examplo:</p>
<pre><code>while (true) {
    String input = in.next();
    if (input.equals("Q")) break; // Exits loop
    Process input
    }// break jumps here</code></pre>

<h2>Continue</h2>
<pre><code>while (in.hasNextInt()) {
    int input = in.nextInt();
    if (input < 0) continue; // Jumps to test of in.hasNextInt()
    Process input
}</code></pre>
<p>exemplo:</p>
<pre><code>for (int i = 1; i <= target; i++) {
    int input = in.nextInt();
    if (n < 0) continue; // Jumps to i++
    Process input
}</code></pre>
<h2> Local Variable Scope</h2>
<pre><code>public static void main(String[] args) { // Scope of args starts here
    ...
    // Scope of args ends here
}</code></pre>

<p>Exemplo onde o i é atualizado</p>
<pre><code>for (int i = 0; i < n; i++) { // i is in scope for the test and update
    ...
    }// i not defined here</code></pre>

<p>Exemplo onde é preciso o valor de i</p>
<pre><code>int i;
    for (i = 0; !found && i < n; i++) {
    ...
    }// i still available</code></pre>
<p>No Java não pode ter variavél sobreposta</p>
<pre><code>int i = 0;
    while (...) {
    String i = in.next(); // Error to declare another variable i
    ...
}</code></pre>
<h2>Trabalhando com Arrays</h2>
<pre><code>
    String[] names;
    names = new String[100];
    String[] names = new String[100];
</code></pre>
<p>Se tentar acessar um elemento que não existe vai ocorrer uma exception: ArrayIndexOutOfBoundsException.</p>
<h2>Obter um elemento do array</h2>
<pre><code>for (int i = 0; i < names.length; i++) {
    names[i] = "";
}</code></pre>
<p>Pode construit um array com BigInteger</p>
<pre><code>BigInteger[] numbers = new BigInteger[100];
    for (int i = 0; i < 100; i++)
    numbers[i] = BigInteger.valueOf(i);
</code></pre>
<p>Informando valores diretamente no array</p>
<pre><code>int[] primes = { 2, 3, 5, 7, 11, 13 };</code></pre>
<p>Array de string</p>
<pre><code>String[] authors = {
    "James Gosling",
    "Bill Joy",
    "Guy Steele",
    // Add more names here and put a comma after each name
};</code></pre>
<p>Um exemplo de inicialização de array</p>
<pre><code>primes = new int[] { 17, 19, 23, 29, 31 };</code></pre>
<h2>Array List</h2>
<pre><code>friends = new ArrayList<>();
    friends.add("Peter");
    friends.add("Paul");</code></pre>
<p>Construtor do array list</p>
<pre><code>ArrayList<String> friends = new ArrayList<>(List.of("Peter", "Paul"));</code></pre>
<p>Remover elementos</p>
<pre><code>friends.remove(1);
    friends.add(0, "Paul"); // Adds before index 0
</code></pre>
<p>Acessar e setar elementos</p>
<pre><code>String first = friends.get(0);
    friends.set(1, "Mary");
    
    for (int i = 0; i < friends.size(); i++) {
        System.out.println(friends.get(i));
    }
</code></pre>
<p>É ilegal a expressão com primitivos:</p>
<pre><code> ArrayList<int> i</code></pre>
<h2>Classe Wrapper</h2>
<pre><code>ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(42);
    int first = numbers.get(0);
</code></pre>
<p>Wrapper usa o método equals e não == para comparação.</p>
<pre><code>if (numbers.get(i) == numbers.get(j)) //forma incorreta
    (numbers.get(i).equals(j);
</code></pre>
<h2>Loops</h2>
<pre><code>int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}</code></pre>
<p>Forma comum</p>
<pre><code>int sum = 0;
    for (int n : numbers) {
    sum += n;
}</code></pre>
<pre><code>for (String name : friends) {
    System.out.println(name);
}</code></pre>

<p>Copiando array</p>
<pre><code>int[] numbers = primes;
    numbers[5] = 42; // Agora primes[5] é 42
</code></pre>

<p>Método para copiar</p>
<pre><code>int[] copiedPrimes = Arrays.copyOf(primes, primes.length);</code></pre>

<p>No método construtor</p>
<pre><code>ArrayList<String> people = friends;
    people.set(0, "Mary"); // Now friends.get(0) is also "Mary"
</code></pre>

<p>Copiar um array list</p>
<pre><code>ArrayList<String> copiedFriends = new ArrayList<>(friends);</code></pre>

<p>Wrap usa o List.of</p>
<pre><code>String[] names = ...;
    ArrayList<String> friends = new ArrayList<>(List.of(names));
</code></pre>
<pre><code>String[] names = friends.toArray(new String[0]);</code></pre>

<h2>classe Array Algorithms</h2>
<pre><code>Arrays.fill(numbers, 0); // int[] array
    Collections.fill(friends, ""); // ArrayList<String>
</code></pre>
<pre><code>Arrays.fill(numbers, 0); // int[] array
    Collections.fill(friends, ""); // ArrayList<String>
</code></pre>
<p>Método toString</p>
<pre><code>String elements = friends.toString();
    // Sets elements to "[Peter, Paul, Mary]"
    System.out.println(friends);
    // Calls friends.toString() and prints the result 
</code></pre>
<p>Parâmetro para executar comandos em linha</p>
<pre><code>public static void main(String[] args)</code></pre>
<pre><code>public class Greeting {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {            
            String arg = args[i];            
            if (arg.equals("-h")) arg = "Hello";            
            else if (arg.equals("-g")) arg = "Goodbye";
                System.out.println(arg);
        }
    }
}
</code></pre>
<h2> Multidimensional Arrays</h2>
<pre><code>int[][] square = {
    { 16, 3, 2, 13 },
    { 5, 10, 11, 8 },
    { 9, 6, 7, 12 },
    { 4, 15, 14, 1}
};</code></pre>

<p>Para acessar os elementos usa:</p>
<pre><code>int[] temp = square[0];
    square[0] = square[1];
    square[1] = temp;
</code></pre>













