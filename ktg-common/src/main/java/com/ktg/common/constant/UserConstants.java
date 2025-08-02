package com.ktg.common.constant;

/**
 * 用户常量信息
 */
public class UserConstants
{
    /** 部门正常状态 */
    public static final String DEPT_NORMAL = "0";

    /** 部门停用状态 */
    public static final String DEPT_DISABLE = "1";

    /** 是否为系统默认（是） */
    public static final String YES = "Y";

    public static final String NO = "N";

    /** 是否菜单外链（是） */
    public static final String YES_FRAME = "0";

    /** 是否菜单外链（否） */
    public static final String NO_FRAME = "1";

    /** 菜单类型（目录） */
    public static final String TYPE_DIR = "M";

    /** 菜单类型（菜单） */
    public static final String TYPE_MENU = "C";

    /** Layout组件标识 */
    public final static String LAYOUT = "Layout";

    /** ParentView组件标识 */
    public final static String PARENT_VIEW = "ParentView";

    /** InnerLink组件标识 */
    public final static String INNER_LINK = "InnerLink";

    public final static String WEBSOCKET_HEARTBEAT = "-heartbeat-";

    /** 校验返回结果码 */
    public final static String UNIQUE = "0";
    public final static String NOT_UNIQUE = "1";

    /**
     * 用户名长度限制
     */
    public static final int USERNAME_MIN_LENGTH = 2;
    public static final int USERNAME_MAX_LENGTH = 20;

    /**
     * 密码长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 5;
    public static final int PASSWORD_MAX_LENGTH = 20;

    /**
     * 流程相关
     */
    //待办的状态
    public static final int TODOLIST_STATUS_NORMAL = 0; //正常
    public static final int TODOLIST_STATUS_FINISHED = 1; //已完成
    public static final int TODOLIST_STATUS_DELETED = 2; //已删

    /**
     * 各种业务单据的内定自动编码规则标识
     */
    public static final String VENDOR_CODE = "VENDOR_CODE";
    public static final String ITEM_TYPE_CODE ="ITEM_TYPE_CODE";
    public static final String ITEM_CODE ="ITEM_CODE";
    public static final String MACHINERY_TYPE_CODE="MACHINERY_TYPE_CODE";
    public static final String TASK_CODE="TASK_CODE";
    public static final String DEFECT_CODE = "DEFECT_CODE";
    public static final String SN_CODE = "SN_CODE";
    public static final String STOCKTAKING_CODE ="WM_STOCK_TAKING_CODE"; //盘点任务
    public static final String FEEDBACK_CODE ="FEEDBACK_CODE"; //报工单
    public static final String BATCH_CODE ="BATCH_CODE"; //批次编号

    /**
     * 单据的状态类型
     */
    public static final String ORDER_STATUS_PREPARE="PREPARE";
    public static final String ORDER_STATUS_CONFIRMED="CONFIRMED";
    public static final String ORDER_STATUS_APPROVING="APPROVING";
    public static final String ORDER_STATUS_APPROVED="APPROVED";
    public static final String ORDER_STATUS_FINISHED="FINISHED";
    public static final String ORDER_STATUS_CANCELED="CANCELED";

    /**
     * 物资类型
     */
    public static final String ITEM_TYPE_ITEM = "ITEM"; //物料
    public static final String ITEM_TYPE_PRODUCT = "PRODUCT"; //产品

    /**
     * 维护类型
     */
    public static final String MAINTEN_TYPE_REGULAR="REGULAR";
    public static final String MAINTEN_TYPE_USAGE="USAGE";

    /**
     * 甘特图中的TASK类型
     */
    public static final String GANTT_TASK_TYPE_TASK="task";
    public static final String GANTT_TASK_TYPE_PROJECT="project";

    /**
     * 报表相关
     */
    public static final String REPORT_PRINT_TYPE ="print";
    public static final String REPORT_PDF_TYPE ="pdf";
    public static final String REPORT_EXCEL_TYPE ="excel";
    public static final String REPORT_WORD_TYPE ="word";
    public static final String REPORT_JASPER_PATH="reports/jasper/";

    /**
     * 库存事务类型
     */
    public static final String TRANSACTION_TYPE_ITEM_RECPT = "ITEM_RECPT"; //原材料接收入库
    public static final String TRANSACTION_TYPE_ITEM_RTV = "ITEM_RTV"; //原材料退回供应商

    public static final String TRANSACTION_TYPE_ITEM_ISSUE_OUT = "ITEM_ISSUE_OUT"; //生产领用-出库事务
    public static final String TRANSACTION_TYPE_ITEM_ISSUE_IN = "ITEM_ISSUE_IN"; //生产领用-入库事务

    public static final String TRANSACTION_TYPE_OUTSOURCE_ISSUE_OUT ="OUTSOURCE_ISSUE_OUT"; //外协领用-出库事务
    public static final String TRANSACTION_TYPE_OUTSOURCE_RECPT_IN ="OUTSOURCE_RECPT_IN"; //外协入库-入库事务

    public static final String TRANSACTION_TYPE_ITEM_RT_ISSUE_OUT = "ITEM_RT_ISSUE_OUT"; //生产退料-出库事务
    public static final String TRANSACTION_TYPE_ITEM_RT_ISSUE_IN = "ITEM_RT_ISSUE_IN"; //生产退料-入库事务

    public static final String TRANSACTION_TYPE_WAREHOUSE_TRANS_OUT = "TRANS_OUT"; //移库,移出
    public static final String TRANSACTION_TYPE_WAREHOUSE_TRANS_IN = "TRANS_IN"; //移库,移入

    public static final String TRANSACTION_TYPE_ITEM_CONSUME = "ITEM_CONSUME";//物料生产消耗
    public static final String TRANSACTION_TYPE_PRODUCT_PRODUCE = "PRODUCT_PRODUCE";//产品生产

    public static final String TRANSACTION_TYPE_PRODUCT_RECPT_OUT = "PRODUCT_RECPT_OUT"; //产品入库-出库事务
    public static final String TRANSACTION_TYPE_PRODUCT_RECPT_IN = "PRODUCT_RECPT_IN"; //产品入库-入库事务

    public static final String TRANSACTION_TYPE_PRODUCT_ISSUE = "PRODUCT_SALSE"; //销售出库
    public static final String TRANSACTION_TYPE_PRODUCT_RS = "PRODUCT_RT"; //销售退货

    public static final String TRANSACTION_TYPE_MISC_RECPT = "MISC_RECPT"; //杂项入库
    public static final String TRANSACTION_TYPE_MISC_ISSUE = "MISC_ISSUE"; //杂项出库

    /**
     * 轮班方式
     */
    public static final String CAL_SHIFT_TYPE_SINGLE="SINGLE";
    public static final String CAL_SHIFT_TYPE_TWO="SHIFT_TWO";
    public static final String CAL_SHIFT_TYPE_THREE="SHIFT_THREE";
    public static final String CAL_SHIFT_NAME_DAY="白班";
    public static final String CAL_SHIFT_NAME_NIGHT="夜班";
    public static final String CAL_SHIFT_NAME_MID="中班";
    public static final String CAL_SHIFT_METHOD_QUARTER="QUARTER";
    public static final String CAL_SHIFT_METHOD_MONTH="MONTH";
    public static final String CAL_SHIFT_METHOD_WEEK="WEEK";
    public static final String CAL_SHIFT_METHOD_DAY="DAY";

    /**
     * 排班日历的查询方式
     */
    public static final String CAL_QUERY_BY_TYPE="TYPE";
    public static final String CAL_QUERY_BY_TEAM="TEAM";
    public static final String CAL_QUERY_BY_USER="USER";

    /**
     * 检测单类型，这里的类型是大类
     * 首检、末检等等是过程检验中的子分类
     */
    public static final String QC_TYPE_IQC = "IQC"; //来料检验单
    public static final String QC_TYPE_PQC = "PQC"; //过程检验单
    public static final String QC_TYPE_RQC = "RQC"; //退料检验
    public static final String QC_TYPE_OQC = "OQC"; //出货检验

    /**
     * 默认线边库对应的仓库、库区、库位编码
     */
    public static  final String VIRTUAL_WH ="XBK_VIRTUAL";
    public static  final String VIRTUAL_WS ="XBKKQ_VIRTUAL";
    public static  final String VIRTUAL_WA ="XBKKW_VIRTUAL";

    /**
     * 条码格式
     */
    public static final String QR_CODE = "QR_CODE";
    public static final String EAN_CODE = "EAN_CODE";
    public static final String UPC_CODE = "UPC_CODE";
    public static final String CODE39_CODE = "CODE39_CODE";

    /**
     * 条码类型
     */
    public static final String BARCODE_TYPE_ITEM = "ITEM"; //物料
    public static final String BARCODE_TYPE_BATCH = "BATCH"; //批次
    public static final String BARCODE_TYPE_PACKAGE = "PACKAGE"; //装箱单
    public static final String BARCODE_TYPE_STOCK = "STOCK"; //库存
    public static final String BARCODE_TYPE_MACHINERY = "MACHINERY"; //设备
    public static final String BARCODE_TYPE_WORKSTATION = "WORKSTATION"; //工作站
    public static final String BARCODE_TYPE_WAREHOUSE = "WAREHOUSE"; //仓库
    public static final String BARCODE_TYPE_STORAGELOCATION = "LOCATION"; //库区
    public static final String BARCODE_TYPE_STORAGEAREA = "AREA"; //库位
    public static final String BARCODE_TYPE_TRANSORDER = "TRANSORDER"; //流转单
    public static final String BARCODE_TYPE_CLIENT = "CLIENT"; //客户
    public static final String BARCODE_TYPE_VENDOR = "VENDOR"; //供应商
    public static final String BARCODE_TYPE_WORKSHOP = "WORKSHOP";
    public static final String BARCODE_TYPE_WORKORDER = "WORKORDER";
    public static final String BARCODE_TYPE_TOOL = "TOOL";
    public static final String BARCODE_TYPE_SN = "SN";
    public static final String BARCODE_TYPE_PROCARD ="PROCARD";
    public static final String TEST_TYPE_PRINTER = "TEST";

    /**
     * 消息状态
     */
    public static final String MESSAGE_STATUS_UNREAD = "UNREAD"; //未读
    public static final String MESSAGE_STATUS_READ = "READ";//已读
    public static final String MESSAGE_STATUS_PROCEED = "PROCEED";//已处理

    /**
     * 库存盘点类型
     */
    public static final String WM_STOCK_TAKING_TYPE_DYNAMIC = "DYNAMIC"; //动态盘点
    public static final String WM_STOCK_TAKING_TYPE_STATIC = "STATIC"; //静态盘点//明盘

    /**
     * 库存盘点结果
     */
    public static final String WM_STOCK_TAKING_STATUS_LOSS = "LOSS";// 盘亏
    public static final String WM_STOCK_TAKING_STATUS_PROFIT = "PROFIT"; //盘盈
    public static final String WM_STOCK_TAKING_STATUS_NORMAL = "NORMAL"; //正常

    /**
     * 库存盘点方案的参数类型
     */
    public static final String WM_STOCK_TAKING_PARAM_TYPE_BATCH = "BATCH"; //批次
    public static final String WM_STOCK_TAKING_PARAM_TYPE_ITEM = "ITEM"; //物料
    public static final String WM_STOCK_TAKING_PARAM_TYPE_LOCATION = "LOCATION"; //库区
    public static final String WM_STOCK_TAKING_PARAM_TYPE_WAREHOUSE = "WAREHOUSE"; //仓库

    /**
     * 数值比较结果
     */
    public static final String GREATER_THAN = "G";
    public static final String LESS_THAN = "L";
    public static final String EQUAL_TO = "E";

    /**
     * 质量状态
     */
    public static final String QUALITY_STATUS_PASS = "OK"; //合格
    public static final String QUALITY_STATUS_NOTGOOD = "NG"; //不合格
    public static final String QUALITY_STATUS_NOTTEST = "NT"; //拒绝

    /**
     * 质量检测结果
     */
    public static final String QUALITY_CHECK_RESULT_ACCEPT = "ACCEPT"; //合格
    public static final String QUALITY_CHECK_RESULT_REJECT = "REJECT"; //不合格

    /**
     * 退料类型
     */
    public static final String RTISSUE_TYPE_RMR = "RMR"; //余料退料
    public static final String RTISSUE_TYPE_DMR = "DMR"; //坏料退料
    public static final String RTISSUE_TYPE_SMR = "SMR"; //废料退料

    /**退料单状态*/
    public static final String RTISSUE_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String RTISSUE_STATUS_UNCHECK = "UNCHECK"; //待检验
    public static final String RTISSUE_STATUS_UNSTOCK = "UNSTOCK"; //待上架
    public static final String RTISSUE_STATUS_UNEXECUTE = "UNEXECUTE"; //待执行退料
    public static final String RTISSUE_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String RTISSUE_STATUS_CANCELED = "CANCELED"; //已取消

    /**
     * 来源单据类型
     */
    public static final String SOURCE_DOC_TYPE_ARRIVALNOTICE = "ARRIVAL_NOTICE"; //到货通知单
    public static final String SOURCE_DOC_TYPE_RTISSUE = "RT_ISSUE"; //生产退料单
    public static final String SOURCE_DOC_TYPE_PRODUCT_SALSE = "PRODUCT_SALES"; //销售出库单
    public static final String SOURCE_DOC_TYPE_RTSALSE = "RT_SALES"; //销售退货单
    public static final String SOURCE_DOC_TYPE_FEEDBACK = "FEEDBACK"; //生产报工单
    public static final String SOURCE_DOC_TYPE_OUTSOURCE_RECPT = "OUTSOURCE_RECPT"; //外协入库单

    /**
     * 库位上物资混放检测结果
     */
    public static final String AREA_MIXING_CHECK_RESULT_OK = "OK"; //允许存放
    public static final String AREA_MIXING_CHECK_RESULT_NO_MATERIAL = "NO_MATERIAL"; //不允许物资混放
    public static final String AREA_MIXING_CHECK_RESULT_NO_BATCH = "NO_BATCH"; //不允许批次混放

    /**
     * 报工单的状态
     */
    public static final String FEEDBACK_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String FEEDBACK_STATUS_APPROVING = "APPROVING"; //待审核
    public static final String FEEDBACK_STATUS_UNCHECK = "UNCHECK"; //待检验
    public static final String FEEDBACK_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String FEEDBACK_STATUS_CANCELED = "CANCELED"; //已取消

    /**
     * 销售出库单的状态
     */
    public static final String PRODUCT_SALES_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String PRODUCT_SALES_STATUS_UNSTOCK = "UNSTOCK"; //待拣货
    public static final String PRODUCT_SALES_STATUS_UNCHECK = "UNCHECK"; //待检验
    public static final String PRODUCT_SALES_STATUS_UNSHIPPING = "UNSHIPPING"; //待填写运单
    public static final String PRODUCT_SALES_STATUS_UNEXECUTE = "UNEXECUTE"; //待执行
    public static final String PRODUCT_SALES_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String PRODUCT_SALES_STATUS_CANCELED = "CANCELED"; //已取消

    /**
     * 销售退货单的状态
     */
    public static final String RT_SALES_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String RT_SALES_STATUS_UNSTOCK = "UNSTOCK"; //待拣货
    public static final String RT_SALES_STATUS_UNCHECK = "UNCHECK"; //待检验
    public static final String RT_SALES_STATUS_UNEXECUTE= "UNEXECUTE"; //待执行
    public static final String RT_SALES_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String RT_SALES_STATUS_CANCELED = "CANCELED"; //已取消

    /**
     * 转移单状态
     */
    public static final String TRANSFER_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String TRANSFER_STATUS_UNCONFIRMED = "UNCONFIRMED"; //待到货确认
    public static final String TRANSFER_STATUS_UNSTOCK = "UNSTOCK"; //待上架
    public static final String TRANSFER_STATUS_UNEXECUTE = "UNEXECUTE"; //待执行
    public static final String TRANSFER_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String TRANSFER_STATUS_CANCELED = "CANCELED"; //已取消

    /**外协入库单状态*/
    public static final String OUTSOURCE_RECPT_STATUS_PREPARE = "PREPARE"; //草稿
    public static final String OUTSOURCE_RECPT_STATUS_UNCHECK = "UNCHECK"; //待检验
    public static final String OUTSOURCE_RECPT_STATUS_UNSTOCK = "UNSTOCK"; //待上架
    public static final String OUTSOURCE_RECPT_STATUS_UNEXECUTE = "UNEXECUTE"; //待执行入库
    public static final String OUTSOURCE_RECPT_STATUS_FINISHED = "FINISHED"; //已完成
    public static final String OUTSOURCE_RECPT_STATUS_CANCELED = "CANCELED"; //已取消
}
