import java.util.Collection;

public interface MyList<E> extends java.util.Collection<E> {
    E get(int index);
    int indexOf(Object e);
    int lastIndexOf(E e);
    E remove(int index);
    E set(int index, E e);
    void add(int index, E e);

    @Override
    default boolean addAll(Collection<? extends E> collection){
        for(E value:collection)
            add(value);
        return true;
    }
    @Override
    default boolean isEmpty(){
        return size() == 0;
    }
    @Override
    default boolean removeAll(Collection<?> collection){
        if(isEmpty()){
            return false;
        }
        for(int i = 0; i < size(); i++){
            if(collection.contains(get(i))){
                remove(i);
                i--;
            }
        }
        return true;
    }
    @Override
    default Object[]toArray(){
        if(isEmpty())
            return null;
        Object[]obj = new Object[size()];
        for(int i = 0; i < size(); i++){
            obj[i] = get(i);
        }
        return obj;
    }
    @Override
    default boolean add(E e){
        add(size(), e);
        return true;
    }
    @Override
    default boolean remove(Object e){
        if(contains(e)){
            remove(indexOf(e));
            return true;
        }
        return false;
    }
    @Override
    default boolean containsAll(Collection<?> collection){
        for(Object value:collection){
            if(!contains(value)){
                return false;
            }
        }
        return true;
    }
    @Override
    default boolean retainAll(Collection<?> collection){
        if(isEmpty()){
            return false;
        }
        for(int i = 0; i < size(); i++){
            if(!collection.contains(get(i))){
                remove(i);
                i--;
            }
        }
        return true;
    }
    @Override
    default  <T> T[] toArray(T[] a) {
        if(a.length <= size()){
            for(int i = 0; i < a.length; i++){
                a[i] = (T)get(i);
            }
        }
        return a;
    }
}