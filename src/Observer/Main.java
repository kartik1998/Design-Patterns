package Observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}

class NewsAgency implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String news = null;

    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) o.update(news);
    }

    public void updateNews(String news) {
        this.news = news;
        notifyObservers();
    }
}

class NewsReader implements Observer {
    private String name;

    public NewsReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("%s read news= %s", name, message));
    }
}

public class Main {
    public static void main(String[] args) {
        NewsReader kartik = new NewsReader("kartik");
        NewsReader aman = new NewsReader("aman");

        NewsAgency aajTak = new NewsAgency();
        aajTak.attach(kartik);
        aajTak.attach(aman);

        aajTak.updateNews("ABC");
        aajTak.updateNews("DEF");
    }
}
