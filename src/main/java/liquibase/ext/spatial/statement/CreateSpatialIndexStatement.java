package liquibase.ext.spatial.statement;

import liquibase.statement.AbstractSqlStatement;

import java.math.BigDecimal;

/**
 * <code>CreateSpatialIndexStatement</code> represents a
 * <code>CREATE SPATIAL INDEX</code> statement.
 */
public class CreateSpatialIndexStatement extends AbstractSqlStatement {

    private final String indexName;
    private final String tableCatalogName;
    private final String tableSchemaName;
    private final String tableName;
    private final String[] columns;
    private String tablespace;

    /**
     * The WKT geometry type (e.g. Geometry, Point, etc).
     */
    private String geometryType;

    /**
     * The Spatial Reference ID (e.g. 4326).
     */
    private Integer srid;

    private BigDecimal minX;
    private BigDecimal maxX;
    private BigDecimal minY;
    private BigDecimal maxY;
    private BigDecimal minZ;
    private BigDecimal maxZ;
    private BigDecimal tolerance;

    /**
     * Constructs a new instance with the given parameters.
     *
     * @param indexName        the name of the index to create.
     * @param tableCatalogName the optional table's catalog name.
     * @param tableSchemaName  the optional table's schema name.
     * @param tableName        the table name.
     * @param columns          the array of column names.
     * @param tablespace       the optional table space name.
     * @param geometryType     the optional geometry type.
     * @param srid             the optional Spatial Reference ID.
     */
    public CreateSpatialIndexStatement(final String indexName, final String tableCatalogName, final String tableSchemaName,
                                       final String tableName, final String[] columns, final String tablespace,
                                       final String geometryType, final Integer srid) {
        this.indexName = indexName;
        this.tableCatalogName = tableCatalogName;
        this.tableSchemaName = tableSchemaName;
        this.tableName = tableName;
        this.columns = columns.clone();
        this.tablespace = tablespace;
        this.geometryType = geometryType;
        this.srid = srid;
    }

    public CreateSpatialIndexStatement(String indexName, String tableCatalogName, String tableSchemaName,
                                       String tableName, String[] columns, String tablespace,
                                       String geometryType, Integer srid,
                                       BigDecimal minX, BigDecimal maxX,
                                       BigDecimal minY, BigDecimal maxY,
                                       BigDecimal minZ, BigDecimal maxZ,
                                       BigDecimal tolerance) {
        this.indexName = indexName;
        this.tableCatalogName = tableCatalogName;
        this.tableSchemaName = tableSchemaName;
        this.tableName = tableName;
        this.columns = columns.clone();
        this.tablespace = tablespace;
        this.geometryType = geometryType;
        this.srid = srid;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minZ = minZ;
        this.maxZ = maxZ;
        this.tolerance = tolerance;
    }

    public String getTableCatalogName() {
        return this.tableCatalogName;
    }

    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String[] getColumns() {
        return this.columns;
    }

    public String getTablespace() {
        return this.tablespace;
    }

    public CreateSpatialIndexStatement setTablespace(final String tablespace) {
        this.tablespace = tablespace;
        return this;
    }

    /**
     * Sets the WKT geometry type (e.g. Geometry, Point, etc).
     *
     * @param geometryType the geometry type.
     */
    public void setGeometryType(final String geometryType) {
        this.geometryType = geometryType;
    }

    /**
     * Returns the WKT geometry type (e.g. Geometry, Point, etc).
     *
     * @return the geometry type.
     */
    public String getGeometryType() {
        return this.geometryType;
    }

    /**
     * Sets the Spatial Reference ID (e.g. 4326).
     *
     * @param srid the SRID.
     */
    public void setSrid(final Integer srid) {
        this.srid = srid;
    }

    /**
     * Returns the Spatial Reference ID (e.g. 4326).
     *
     * @return the SRID.
     */
    public Integer getSrid() {
        return this.srid;
    }

    public BigDecimal getMinX() {
        return minX;
    }

    public void setMinX(BigDecimal minX) {
        this.minX = minX;
    }

    public BigDecimal getMaxX() {
        return maxX;
    }

    public void setMaxX(BigDecimal maxX) {
        this.maxX = maxX;
    }

    public BigDecimal getMinY() {
        return minY;
    }

    public void setMinY(BigDecimal minY) {
        this.minY = minY;
    }

    public BigDecimal getMaxY() {
        return maxY;
    }

    public void setMaxY(BigDecimal maxY) {
        this.maxY = maxY;
    }

    public BigDecimal getMinZ() {
        return minZ;
    }

    public void setMinZ(BigDecimal minZ) {
        this.minZ = minZ;
    }

    public BigDecimal getMaxZ() {
        return maxZ;
    }

    public void setMaxZ(BigDecimal maxZ) {
        this.maxZ = maxZ;
    }

    public BigDecimal getTolerance() {
        return tolerance;
    }

    public void setTolerance(BigDecimal tolerance) {
        this.tolerance = tolerance;
    }
}
