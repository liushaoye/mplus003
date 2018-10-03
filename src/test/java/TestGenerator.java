import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

import java.sql.SQLException;


/**
 * @author liuyangos8888
 * <p>
 * 代码生成器
 * <p>
 * test
 */
public class TestGenerator {


    /**
     * 代码生成器
     *
     * @throws SQLException
     */
    @Test
    public void testGenerator() throws SQLException {

//     1、全局配置

        GlobalConfig globalConfig = new GlobalConfig();

        // 是否支持AR模式,true开启

        globalConfig.setActiveRecord(true);

        // 设置作者
        globalConfig.setAuthor("Mr.Liu");

        // 生成路径
        globalConfig.setOutputDir("/Users/liuyangos8888/IdeaProjects/mplus003/src/main/java");

        // 文件覆盖
        globalConfig.setFileOverride(true);

        // 主键策略
        globalConfig.setIdType(IdType.AUTO);


        //  设置生成的service接口的名字的首字母是否有I，需要没有如下设置
        globalConfig.setServiceName("%sService");

        // 基础的baseResultMap，返回结果集
        globalConfig.setBaseResultMap(true);

        // 基础的SQL片段
        globalConfig.setBaseColumnList(true);


//     2、数据源配置

        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        // 设置数据库类型
        dataSourceConfig.setDbType(DbType.MYSQL);

        // 设置连接信息
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");

        // 设置URL
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mp");

        // 设置用户
        dataSourceConfig.setUsername("root");

        // 设置密码
        dataSourceConfig.setPassword("123456");


//     3、策略配置

        StrategyConfig strategyConfig = new StrategyConfig();

        // 全局大写命名
        strategyConfig.setCapitalMode(true);


        // 指定表名和字段名使用下划线
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);

        // 数据库表映射到实体的命名策略
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);

        // 表明前缀
        strategyConfig.setTablePrefix("tbl_");

        // 生成的表
        strategyConfig.setInclude("tbl_employee");


//     4、包名策略配置

        PackageConfig packageConfig = new PackageConfig();

        // 所有父包
        packageConfig.setParent("com.baidu.www");

        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        packageConfig.setEntity("bean");
        packageConfig.setXml("mapper");


//        5、整合配置

        AutoGenerator autoGenerator = new AutoGenerator();

        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);

//        6、执行

        autoGenerator.execute();
    }


}
