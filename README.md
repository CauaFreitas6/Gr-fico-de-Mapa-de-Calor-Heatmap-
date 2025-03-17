# Gráfico de mapa de calor (Heatmap)

Mapa de Calor (Heatmap) em Java com JFreeChart
Este projeto demonstra como criar um Mapa de Calor (Heatmap) utilizando a biblioteca JFreeChart em Java. O mapa de calor é uma visualização gráfica que utiliza cores para representar dados em uma matriz 2D, permitindo identificar padrões e distribuições de valores de maneira intuitiva.

Funcionalidades:
Exibição de Mapa de Calor: Utiliza o XYBlockRenderer do JFreeChart para renderizar um mapa de calor baseado em dados 2D.
Escala de Cores Gradiente: A escala de cores vai de azul (valores baixos) a vermelho (valores altos), usando um gradiente de cores para representar a intensidade dos valores.
Dados Aleatórios: Para fins demonstrativos, o código gera dados aleatórios, mas pode ser facilmente adaptado para carregar e visualizar dados reais de diferentes fontes.
Interface Gráfica Swing: A visualização é exibida em uma interface gráfica simples, com a biblioteca Swing.
Como Funciona:
O gráfico exibe uma matriz de valores onde cada célula é colorida com base no valor associado.
Eixos X e Y representam a posição na matriz (e.g., coordenadas).
Valores aleatórios são gerados para demonstrar o funcionamento do gráfico, mas este modelo pode ser facilmente adaptado para outros tipos de dados.
Aplicações:
Visualização de Dados de Grande Escala: Útil para representar grandes conjuntos de dados 2D, como mapas de calor de temperatura, métricas de desempenho ou análises de padrões.
Business Intelligence: Pode ser usado para demonstrar como diferentes parâmetros ou variáveis se comportam em relação a outras, utilizando cores para destacar valores críticos.
Análise de Dados e Ciência de Dados: Ideal para visualização de matrizes de correlação ou distribuição de intensidades em dados experimentais.
Dependências:
JFreeChart para geração de gráficos.
Adicione a seguinte dependência ao seu projeto Maven:

xml
Copiar
Editar
<dependency>
    <groupId>org.jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.5.3</version>
</dependency>
Exemplo de Uso:
O código cria um mapa de calor 10x10, mas pode ser facilmente ajustado para gerar mapas maiores ou com dados reais. Ao executar o código, uma janela gráfica será exibida com o mapa de calor.

Contribuição:
Contribuições para melhorar a visualização, adicionar novos tipos de gráficos ou otimizar o código são bem-vindas!
