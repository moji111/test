package controller;

	import java.awt.Image;
	import java.awt.image.BufferedImage;
	import java.io.IOException;
	import java.nio.Buffer;
	import java.text.Format;

	import javax.imageio.ImageIO;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	import util.FormatAuthCode;



	@Controller
	@RequestMapping("common")
	public class AuthCodeController {
		
		@RequestMapping("authCode")
		public void authCode(HttpServletResponse response,HttpSession session)throws IOException{
			BufferedImage image = FormatAuthCode.getAuthCode(4,85,30,session);
			ImageIO.write(image, "jpg", response.getOutputStream());
			
		

		
		
		}
	}
	
	

