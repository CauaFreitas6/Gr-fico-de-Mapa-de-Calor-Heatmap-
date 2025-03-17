import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYZDataset;
import org.jfree.ui.GradientPaintScale;

import javax.swing.*;
import java.awt.*;

public class HeatmapExample extends JFrame {

    public HeatmapExample() {
        setTitle("Mapa de Calor - Heatmap");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JFreeChart heatmapChart = createHeatmap();
        ChartPanel panel = new ChartPanel(heatmapChart);
        setContentPane(panel);
    }

    private JFreeChart createHeatmap() {
        XYZDataset dataset = createDataset();

        // Criando o eixo X e Y
        NumberAxis xAxis = new NumberAxis("Eixo X");
        NumberAxis yAxis = new NumberAxis("Eixo Y");

        // Criando o Renderer para o mapa de calor
        XYBlockRenderer renderer = new XYBlockRenderer();
        PaintScale scale = new GradientPaintScale(0, 100, Color.BLUE, Color.RED);
        renderer.setPaintScale(scale);

        // Criando o gráfico com o dataset
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart("Mapa de Calor - Exemplo", JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        return chart;
    }

    private XYZDataset createDataset() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();

        int width = 10; // Quantidade de células no eixo X
        int height = 10; // Quantidade de células no eixo Y
        double[][] data = new double[3][width * height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int index = x * height + y;
                data[0][index] = x; // Coordenada X
                data[1][index] = y; // Coordenada Y
                data[2][index] = Math.random() * 100; // Valor (cor relacionada)
            }
        }

        dataset.addSeries("Heatmap", data);
        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HeatmapExample example = new HeatmapExample();
            example.setVisible(true);
        });
    }
}
