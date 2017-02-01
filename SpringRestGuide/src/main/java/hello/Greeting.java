package hello;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Greeting {

    public static Greeting create(long id, String content, String date) {
        return new AutoValue_Greeting(id, content, date);
    }

    public abstract long id();

    public abstract String content();

    public abstract String date();
}