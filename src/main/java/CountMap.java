import java.util.Map;

public interface CountMap<K> {

    void add(Object o);

    int getCount(Object o);

    int remove(Object o);

    int size();

    void addAll(MyMap source);

    Map toMap();

    void toMap(Map destination);






}
