package patterns.creational.builder.improved;

public class MongoDbQueryBuilder implements QueryBuilder{

	private final MongoDbQuery query = new MongoDbQuery();
	
	@Override
	public void from(String from) {
		query.setFrom(from);
	}

	@Override
	public void where(String where) {
		query.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return query;
	}

}
