package cn.yuanwill.xml.schema;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4jTest {

	public static void main(String[] args) {
		
	}

	
	@Test
	public void testReadWebXml(){
		// 1.获取解析器
		SAXReader saxReader = new SAXReader();
		
		try {
			// 2.获取docuemnt文档对象
			Document doc = saxReader.read("src/cn/yuanwill/xml/schema/web.xml");
			
			// 3.获取根元素
			Element rootElement = doc.getRootElement();
			System.out.println(rootElement.getName());
			// 获取根元素的属性值
			System.out.println(rootElement.attributeValue("version"));
			
			// 4.获取根元素的子元素
			List<Element> childElements = rootElement.elements();
			
			// 5.遍历子元素
			for (Element element : childElements) {
//				System.out.println(element.getName());
				if("servlet".equals(element.getName())) {
					Element subchildElement = element.element("servlet-name");
					System.out.println(subchildElement.getText());
				}
			}
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
	}
}
