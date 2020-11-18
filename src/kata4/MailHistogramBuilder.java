package kata4;

import java.util.List;

class MailHistogramBuilder {

    static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        for(Mail object: mailList){
            histogram.increment(object.getDomain());
        }
        return histogram;
    }
    
}
