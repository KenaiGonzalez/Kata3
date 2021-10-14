
package kata3;

public class main {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
