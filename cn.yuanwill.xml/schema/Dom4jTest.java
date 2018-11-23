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
		// 1.��ȡ������
		SAXReader saxReader = new SAXReader();
		
		try {
			// 2.��ȡdocuemnt�ĵ�����
			Document doc = saxReader.read("src/cn/yuanwill/xml/schema/web.xml");
			
			// 3.��ȡ��Ԫ��
			Element rootElement = doc.getRootElement();
			System.out.println(rootElement.getName());
			// ��ȡ��Ԫ�ص�����ֵ
			System.out.println(rootElement.attributeValue("version"));
			
			// 4.��ȡ��Ԫ�ص���Ԫ��
			List<Element> childElements = rootElement.elements();
			
			// 5.������Ԫ��
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
