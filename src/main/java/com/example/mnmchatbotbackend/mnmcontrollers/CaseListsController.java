///*package com.example.mnmchatbotbackend.mnmcontrollers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/case-lists")
//public class CaseListsController {
//
////    @GetMapping("/")
////    public String redirectToCaseLists(){
////        return "redirect:/case-lists/";
////    }
//}*/
//package com.example.mnmchatbotbackend.mnmcontrollers;
//
//import com.example.mnmchatbotbackend.mnmrepositories.CaseFileRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class CaseListsController {
//    private final CaseFileRepository caseFileRepository;
//
//    public CaseListsController(CaseFileRepository caseFileRepository) {
//        this.caseFileRepository = caseFileRepository;
//    }
//
//    @GetMapping("/case-lists")
//    public String caseLists(Model model) {
//        // Fetch data from the repository
//        List<CaseFile> caseFiles = caseFileRepository.findAll();
//        model.addAttribute("caseFiles", caseFiles);
//        return "case_lists";
//    }
//}
//
