// 더 많은 타입 파라미터 적용하기
package generic;

public class GenericPair<T, V>{
    private T key;
    private V value;

    public GenericPair(T key, V value){
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}