questao 1
A) verdadeiro
B) falso, sao implementados via composicao
C)falso, se chama sobrescrita (override)

questao 2

private preserva o encapsulamento da superclasse ao impedir que subclasses acessem diretamente seus dados internos.

protected pode enfraquecer essa proteção, criando dependências entre classes e dificultando a manutenção.

questao 3

Quando uma subclasse é criada, seu construtor sempre chama primeiro o construtor da superclasse para garantir que a parte herdada do objeto seja inicializada corretamente. Se o programador não chamar explicitamente o construtor da superclasse com super(), o compilador insere essa chamada automaticamente ao construtor padrão (sem parâmetros).