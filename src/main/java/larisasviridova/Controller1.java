package larisasviridova;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.webflow.context.servlet.HttpServletRequestMap;
@Controller
public class Controller1 {
    @RequestMapping("/")
    public class AController {
        @RequestMapping(method = RequestMethod.GET)
        public String GetA(ModelMap model) {

            //model.addAttribute("message", "text from сontroller");
            model.addAttribute("Sum", new Sum());
            return "/";
        }

        @RequestMapping(value="/", method= RequestMethod.POST)
        public String PostA(Sum f, BindingResult br, ModelMap model)
        {
            System.out.println(br.toString());
            System.out.println(f.toString());

            model.addAttribute("Sum", f);

            return "/";
        }

    }
}
