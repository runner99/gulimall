package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallThirdPartyApplicationTests {
//	@Autowired
//	OSSClient ossClient;

	@Test
	public void main() throws FileNotFoundException {

		// Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tDGttSQhGZzuu6rNFuj";
//        String accessKeySecret = "4pLBE6tkV3Usdd4N5cjvecnfcSqs53";
//        // 填写Bucket名称，例如examplebucket。
		String bucketName = "gulimall-runner99";
		// 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
		String objectName = "hhh.jpg";
		// 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
		// 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
		String filePath= "C:\\Users\\wei\\Pictures\\Camera Roll\\WIN_20211209_15_34_46_Pro.jpg";

		// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
		InputStream inputStream = new FileInputStream(filePath);
		// 创建PutObject请求。
//		ossClient.putObject(bucketName, objectName, inputStream);
//		ossClient.shutdown();
		System.out.println("上传完成");
	}




}
