public abstract class AbstractHttpMessage {
  protected Map<String, String> headers;
  protected byte[] body;

  public AbstractHttpMessage() {
    this.headers = new HashMap<>();
    this.body = new byte[0];
  }

  public void addHeaderField(String key, String value) {
    this.headers.put(key, value);
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setBody(byte[] body) {
    this.body = body;
  }

  public byte getBody() {
    return body;
  }

  protected abstract String getStartLine();

  @Override
  public String toString() {
    return getStartLine + () "headers: " + headers + "body: " + new String(body, StandardCharset.UTF_8);
  }
}
