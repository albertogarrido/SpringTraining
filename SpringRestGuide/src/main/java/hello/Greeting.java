package hello;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Greeting {

    public static Greeting create(long id, String content) {
        return new AutoValue_Greeting(id, content);
    }

    public abstract long id();

    public abstract String content();
}