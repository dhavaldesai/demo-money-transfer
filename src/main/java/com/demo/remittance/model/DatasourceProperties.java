/**
 * 
 */
package com.demo.remittance.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dhaval
 *
 */
@Component
public class DatasourceProperties {	

	@Value("${dataSource.jdbcUrl}")
	private String jdbcUrl;

	@Value("${dataSource.username}")
	private String usernameSql;

	@Value("${dataSource.password}")
	private String password;

	@Value("${dataSource.cachePrepStmts}")
	private String cachePrepStmts;

	@Value("${dataSource.prepStmtCacheSize}")
	private String prepStmtCacheSize;

	@Value("${dataSource.prepStmtCacheSqlLimit}")
	private String prepStmtCacheSqlLimit;

	@Value("${dataSource.useServerPrepStmts}")
	private String useServerPrepStmts;

	@Value("${dataSource.useLocalSessionState}")
	private String useLocalSessionState;

	@Value("${dataSource.rewriteBatchedStatements}")
	private String rewriteBatchedStatements;

	@Value("${dataSource.cacheResultSetMetadata}")
	private String cacheResultSetMetadata;

	@Value("${dataSource.cacheServerConfiguration}")
	private String cacheServerConfiguration;

	@Value("${dataSource.elideSetAutoCommits}")
	private String elideSetAutoCommits;

	@Value("${dataSource.maintainTimeStats}")
	private String maintainTimeStats;

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCachePrepStmts() {
		return cachePrepStmts;
	}

	public void setCachePrepStmts(String cachePrepStmts) {
		this.cachePrepStmts = cachePrepStmts;
	}

	public String getPrepStmtCacheSize() {
		return prepStmtCacheSize;
	}

	public void setPrepStmtCacheSize(String prepStmtCacheSize) {
		this.prepStmtCacheSize = prepStmtCacheSize;
	}

	public String getPrepStmtCacheSqlLimit() {
		return prepStmtCacheSqlLimit;
	}

	public void setPrepStmtCacheSqlLimit(String prepStmtCacheSqlLimit) {
		this.prepStmtCacheSqlLimit = prepStmtCacheSqlLimit;
	}

	public String getUseServerPrepStmts() {
		return useServerPrepStmts;
	}

	public void setUseServerPrepStmts(String useServerPrepStmts) {
		this.useServerPrepStmts = useServerPrepStmts;
	}

	public String getUseLocalSessionState() {
		return useLocalSessionState;
	}

	public void setUseLocalSessionState(String useLocalSessionState) {
		this.useLocalSessionState = useLocalSessionState;
	}

	public String getRewriteBatchedStatements() {
		return rewriteBatchedStatements;
	}

	public void setRewriteBatchedStatements(String rewriteBatchedStatements) {
		this.rewriteBatchedStatements = rewriteBatchedStatements;
	}

	public String getCacheResultSetMetadata() {
		return cacheResultSetMetadata;
	}

	public void setCacheResultSetMetadata(String cacheResultSetMetadata) {
		this.cacheResultSetMetadata = cacheResultSetMetadata;
	}

	public String getCacheServerConfiguration() {
		return cacheServerConfiguration;
	}

	public void setCacheServerConfiguration(String cacheServerConfiguration) {
		this.cacheServerConfiguration = cacheServerConfiguration;
	}

	public String getElideSetAutoCommits() {
		return elideSetAutoCommits;
	}

	public void setElideSetAutoCommits(String elideSetAutoCommits) {
		this.elideSetAutoCommits = elideSetAutoCommits;
	}

	public String getMaintainTimeStats() {
		return maintainTimeStats;
	}

	public void setMaintainTimeStats(String maintainTimeStats) {
		this.maintainTimeStats = maintainTimeStats;
	}
	
	@Override
	public String toString() {
		return "DatasourceProperties [jdbcUrl=" + jdbcUrl + ", username=" + usernameSql + ", password=" + password
				+ ", cachePrepStmts=" + cachePrepStmts + ", prepStmtCacheSize=" + prepStmtCacheSize
				+ ", prepStmtCacheSqlLimit=" + prepStmtCacheSqlLimit + ", useServerPrepStmts=" + useServerPrepStmts
				+ ", useLocalSessionState=" + useLocalSessionState + ", rewriteBatchedStatements="
				+ rewriteBatchedStatements + ", cacheResultSetMetadata=" + cacheResultSetMetadata
				+ ", cacheServerConfiguration=" + cacheServerConfiguration + ", elideSetAutoCommits="
				+ elideSetAutoCommits + ", maintainTimeStats=" + maintainTimeStats + "]";
	}

	public String getUsernameSql() {
		return usernameSql;
	}

	public void setUsernameSql(String usernameSql) {
		this.usernameSql = usernameSql;
	}	
}
