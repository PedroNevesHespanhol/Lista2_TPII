/* 
    Sabe-se que o Java, tal como muitas linguagens de alto nível fazem
    o gerenciamento de memória das aplicações. Explique como funcionao Garbage Collector.

    O garbage collector é executado automaticamente pela JVM, sem intervenção do programador, o que significa 
    que o programador não precisa se preocupar com a alocação e desalocação de memória manualmente. 
    O GC é responsável por detectar objetos que não são mais acessíveis pelo programa e 
    liberar a memória alocada para esses objetos.

    1. Identificação de objetos não referenciados: o GC percorre toda a estrutura de objetos na memória, identificando 
    aqueles que não são mais referenciados pelo programa.

    2. Marcação de objetos alcançáveis: a partir dos objetos referenciados, o GC marca os objetos alcançáveis, ou seja, 
    aqueles que ainda são utilizados pelo programa.

    3. Remoção de objetos não alcançáveis: após a marcação dos objetos alcançáveis, o GC remove os objetos que não foram 
    marcados. Essa remoção é feita de forma eficiente, liberando apenas a quantidade de memória necessária para remover 
    os objetos não alcançáveis.
*/ 