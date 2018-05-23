package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.text.SimpleDateFormat;


@Controller
@EnableAutoConfiguration
public class SampleController {

	int num = (int) (Math.random() * 1000);
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
         //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        return "MyID "+num+" Openshift Hello World!"+df.format(new Date());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}