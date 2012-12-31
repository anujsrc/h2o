package water.api;

public class Constants {
  public static class Suffixes {
    // JSON fields with these suffixes will automatically provide some
    // pretty printing.  Users can still override the fields later
    public static final String BYTES               = "_bytes";
    public static final String BYTES_PER_SECOND    = "_bytes_per_second";
    public static final String MILLIS              = "_ms";
  }

  public static final String BADAT                 = "badat";
  public static final String BASE                  = "base";
  public static final String BIN_LIMIT             = "bin_limit";
  public static final String CLASS                 = "class";
  public static final String CLOUD_NAME            = "cloud_name";
  public static final String CLOUD_SIZE            = "cloud_size";
  public static final String COLS                  = "cols";
  public static final String CONSENSUS             = "consensus";
  public static final String CONTENTS              = "contents";
  public static final String CPU_LOAD_1            = "cpu_load_1";
  public static final String CPU_LOAD_15           = "cpu_load_15";
  public static final String CPU_LOAD_5            = "cpu_load_5";
  public static final String CPU_UTIL              = "cpu_util";
  public static final String DATA_KEY              = "data_key";
  public static final String DEPTH                 = "depth";
  public static final String DEST_KEY              = "destination_key";
  public static final String ENUM_DOMAIN           = "enum_domain";
  public static final String ERROR                 = "error";
  public static final String FAILED                = "failed";
  public static final String FEATURES              = "features";
  public static final String FILE                  = "file";
  public static final String FILES                 = "files";
  public static final String FILTER                = "filter";
  public static final String FJ_QUEUE_HI           = "fj_queue_hi";
  public static final String FJ_QUEUE_LO           = "fj_queue_lo";
  public static final String FJ_THREADS_HI         = "fj_threads_hi";
  public static final String FJ_THREADS_LO         = "fj_threads_lo";
  public static final String FREE_DISK             = "free_disk" + Suffixes.BYTES;
  public static final String FREE_MEM              = "free_mem" + Suffixes.BYTES;
  public static final String GINI                  = "gini";
  public static final String ITEMS                 = "items";
  public static final String IGNORE                = "ignore";
  public static final String JSON_H2O              = "h2o";
  public static final String KEY                   = "key";
  public static final String KEYS                  = "keys";
  public static final String LIMIT                 = "limit";
  public static final String LOCKED                = "locked";
  public static final String MAX                   = "max";
  public static final String MAX_DISK              = "max_disk" + Suffixes.BYTES;
  public static final String MAX_MEM               = "max_mem" + Suffixes.BYTES;
  public static final String MAX_ROWS              = "max_rows";
  public static final String MEAN                  = "mean";
  public static final String MIN                   = "min";
  public static final String MODEL_KEY             = "model_key";
  public static final String MORE                  = "more";
  public static final String NAME                  = "name";
  public static final String NO_CM                 = "no_confusion_matrix";
  public static final String NODE                  = "node";
  public static final String NODE_NAME             = "node_name";
  public static final String NODES                 = "nodes";
  public static final String NUM_COLS              = "num_columns";
  public static final String NUM_CPUS              = "num_cpus";
  public static final String NUM_KEYS              = "num_keys";
  public static final String NUM_ROWS              = "num_rows";
  public static final String NUM_TREES             = "ntree";
  public static final String OFFSET                = "offset";
  public static final String OOBEE                 = "oobee";
  public static final String PARALLEL              = "parallel";
  public static final String PROGRESS              = "progress";
  public static final String PROGRESS_TOTAL        = "progress_total";
  public static final String REDIRECT              = "redirect_request";
  public static final String REDIRECT_ARGS         = "redirect_request_args";
  public static final String REPLICATION_FACTOR    = "replication_factor";
  public static final String REQUEST_TIME          = "time";
  public static final String RESPONSE              = "response";
  public static final String ROW                   = "row";
  public static final String ROW_DATA              = "row_data";
  public static final String ROW_SIZE              = "row_size";
  public static final String ROWS                  = "rows";
  public static final String RPCS                  = "rpcs";
  public static final String SAMPLE                = "sample";
  public static final String SCALE                 = "scale";
  public static final String SEED                  = "seed";
  public static final String SENT_ROWS             = "sent_rows";
  public static final String SIZE                  = "size";
  public static final String SOURCE_KEY            = "source_key";
  public static final String STATUS                = "status";
  public static final String STRATA                = "strata";
  public static final String STRATIFY              = "stratify";
  public static final String SUCCEEDED             = "succeeded";
  public static final String TCP_BYTES_RECV        = "tcp_received" + Suffixes.BYTES;
  public static final String TCP_BYTES_SENT        = "tcp_sent" + Suffixes.BYTES;
  public static final String TCP_CONN_IN           = "tcp_incoming_connections";
  public static final String TCP_CONN_OUT          = "tcp_outgoing_connections";
  public static final String TCP_PACKETS_RECV      = "tcp_received_packets";
  public static final String TCP_PACKETS_SENT      = "tcp_sent_packets";
  public static final String TCPS_ACTIVE           = "tcps_active";
  public static final String TIME                  = "time";
  public static final String TOT_MEM               = "tot_mem" + Suffixes.BYTES;
  public static final String TOTAL_BYTES_RECV      = "total_received" + Suffixes.BYTES;
  public static final String TOTAL_BYTES_RECV_RATE = "total_received" + Suffixes.BYTES_PER_SECOND;
  public static final String TOTAL_BYTES_SENT      = "total_sent" + Suffixes.BYTES;
  public static final String TOTAL_BYTES_SENT_RATE = "total_sent" + Suffixes.BYTES_PER_SECOND;
  public static final String TOTAL_CONN_IN         = "total_incoming_connections";
  public static final String TOTAL_CONN_OUT        = "total_outgoing_connections";
  public static final String TOTAL_PACKETS_RECV    = "total_received_packets";
  public static final String TOTAL_PACKETS_SENT    = "total_sent_packets";
  public static final String STACK_TRACES          = "stack_traces";
  public static final String TYPE                  = "type";
  public static final String UDP_BYTES_RECV        = "udp_received" + Suffixes.BYTES;
  public static final String UDP_BYTES_SENT        = "udp_sent" + Suffixes.BYTES;
  public static final String UDP_CONN_IN           = "udp_incoming_connections";
  public static final String UDP_CONN_OUT          = "udp_outgoing_connections";
  public static final String UDP_PACKETS_RECV      = "udp_received_packets";
  public static final String UDP_PACKETS_SENT      = "udp_sent_packets";
  public static final String URL                   = "url";
  public static final String VALUE                 = "value";
  public static final String VALUE_SIZE            = "value_size" + Suffixes.BYTES;
  public static final String VALUE_TYPE            = "type";
  public static final String VARIANCE              = "variance";
  public static final String VIEW                  = "view";
  public static final String WEIGHTS               = "class_weights";
}