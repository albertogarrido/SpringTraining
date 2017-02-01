
package hello;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Greeting extends Greeting {

  private final long id;
  private final String content;

  AutoValue_Greeting(
      long id,
      String content) {
    this.id = id;
    if (content == null) {
      throw new NullPointerException("Null content");
    }
    this.content = content;
  }

  @Override
  public long id() {
    return id;
  }

  @Override
  public String content() {
    return content;
  }

  @Override
  public String toString() {
    return "Greeting{"
        + "id=" + id + ", "
        + "content=" + content
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Greeting) {
      Greeting that = (Greeting) o;
      return (this.id == that.id())
           && (this.content.equals(that.content()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.id >>> 32) ^ this.id;
    h *= 1000003;
    h ^= this.content.hashCode();
    return h;
  }

}
