/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author peta
 */
public abstract class DistributionStatistic extends Statistic {

  /// Data point column the statistic is interested in
  public final int column;
  
  /// Number of categories the data point column can have
  public final int categories;
  
  /// Number of categories the data points may have 
  public final int dataCategories;
  
  
  /** Creates the distribution statistic for given
   * 
   * @param column
   * @param categories
   * @param dataCategories 
   */
  protected DistributionStatistic(int column, int categories, int dataCategories) {
    this.column = column;
    this.categories = categories;
    this.dataCategories = dataCategories;
  }
  
  /** Increments the counter for given column catagory and data category
   * specified by the row. 
   * 
   * @param row
   * @param data
   * @param offset 
   */
  @Override public void addDataPoint(DataAdapter row, long[] data, int offset) {
    addDouble(1, data, (row.toInt(column) * dataCategories)  + row.dataClass() * 4);
  }

  /** For each data category and column category we must remember the count.
   * 
   * All counts are integers.
   * 
   * @return 
   */
  @Override public int dataSize() {
    return categories*dataCategories*4;
  }
}

