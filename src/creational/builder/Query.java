package creational.builder;

public class Query {
  private String selectClause;
  private String tableName;
  private String whereClause;
  private String orderByClause;
  private int limit;

  public Query(Builder builder) {
    this.selectClause = builder.selectClause;
    this.tableName = builder.tableName;
    this.whereClause = builder.whereClause;
    this.orderByClause = builder.orderByClause;
    this.limit = builder.limit;
  }


  public static class Builder {
    private String selectClause;
    private String tableName;
    private String whereClause;
    private String orderByClause;
    private int limit;

    public Builder select(String selectClause) {
      this.selectClause = selectClause;
      return this;
    }

    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    public Builder where(String whereClause) {
      this.whereClause = whereClause;
      return this;
    }

    public Builder orderBy(String orderByClause) {
      this.orderByClause = orderByClause;
      return this;
    }

    public Builder limit(int limit) {
      this.limit = limit;
      return this;
    }

    public Query build() {
      return new Query(this);
    }
  }

  @Override
  public String toString() {
    return String.format("SELECT %s FROM %s WHERE %s ORDER BY %s LIMIT %s", selectClause, tableName, whereClause, orderByClause, limit);
  }
}