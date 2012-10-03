package edu.rpi.tw.escience.waterquality.test;

import java.util.List;
import java.util.Set;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;

import edu.rpi.tw.escience.waterquality.query.BlankNode;
import edu.rpi.tw.escience.waterquality.query.GraphComponent;
import edu.rpi.tw.escience.waterquality.query.GraphComponentCollection;
import edu.rpi.tw.escience.waterquality.query.NamedGraphComponent;
import edu.rpi.tw.escience.waterquality.query.OptionalComponent;
import edu.rpi.tw.escience.waterquality.query.Query;
import edu.rpi.tw.escience.waterquality.query.QueryResource;
import edu.rpi.tw.escience.waterquality.query.UnionComponent;
import edu.rpi.tw.escience.waterquality.query.Variable;

public class MockQuery implements Query {

	@Override
	public void addPattern(QueryResource subject, QueryResource predicate,
			QueryResource object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPattern(QueryResource subject, QueryResource predicate,
			String object, XSDDatatype type) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addFilter(String cond) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addGraphComponent(GraphComponent component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<GraphComponent> getComponents() {
		throw new UnsupportedOperationException();
	}

	@Override
	public GraphComponentCollection getConstructComponent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public NamedGraphComponent getNamedGraph(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public UnionComponent createUnion() {
		throw new UnsupportedOperationException();
	}

	@Override
	public OptionalComponent createOptional() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Variable getVariable(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Variable createVariable(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public BlankNode createBlankNode() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setType(Type type) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type getType() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addFrom(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getFrom() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addFromNamed(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getFromNamed() {
		throw new UnsupportedOperationException();
	}

	@Override
	public QueryResource getResource(String uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setVariables(Set<Variable> object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Variable> getVariables() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addGroupBy(Variable var) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addOrderBy(Variable var, SortType sort) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setDistinct(boolean distinct) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isDistinct() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setReduced(boolean reduced) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isReduced() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setLimit(long limit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long getLimit() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setOffset(long offset) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long getOffset() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addOrderBy(String expr, SortType sort) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Variable createVariableExpression(String expr) {
		throw new UnsupportedOperationException();
	}

}
