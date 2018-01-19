package dashbase.utils.collection;

/**
 * Tuple
 *
 * @author liufengkai
 *         Created by liufengkai on 2017/8/18.
 */
public class Tuple<F, S> {
    public final F first;
    public final S second;

    public Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
