package StepDef;

import PageObject.LifeClaims.IntimateClaimAssessorII;
import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.pages.PageObject;

public class IntimateClaimAssessorIIStep extends PageObject {

    LoginPage LoginPage;
    IntimateClaimAssessorII IntimateClaimAssessorII;

    @Given("log in Life Claims  using a policy number , {string}")
    public void logInLifeClaimsUsingAPolicyNumberPolicyNumber(String PolicyNumber)throws InterruptedException  {
        LoginPage.OpenWebsite();
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();

    }

    @Then("A consultant changes roles to being an assessor and continues to intimate claim  {string}, {string}, {string}, {string}, {string}, {string},{string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string}, {string}")
    public void aConsultantChangesRolesToBeingAnAssessorAndContinuesToIntimateClaimFailedCSearchBSpecSpecAPercentagePercentageIIPercentageIIIAccTBankNmBCodeAccReccoReccoIReccoIIReccoIIIBenNameBenSurBentittleBenIDSReccoIIII(String FailedC, String SearchB, String Spec, String SpecA, String  Percentage, String PercentageII, String PercentageIII,String AccT, String BankNm, String Acc,String BCode, String Recco, String ReccoI, String ReccoII, String ReccoIII,String BenIDS, String BenName, String BenSur, String Bentittle, String ReccoIIII) throws InterruptedException {

        IntimateClaimAssessorII.NavigateBackAsAnAssesssor();
        IntimateClaimAssessorII.MClaims();
        IntimateClaimAssessorII.NxtContact();

//        IntimateClaimAssessorII.DetailsX();
//        IntimateClaimAssessorII.Cpolicy();
//        IntimateClaimAssessorII.ClaimantA();
//        IntimateClaimAssessorII.FClaimant();
//        IntimateClaimAssessorII.FCCComment(FailedC);
//        IntimateClaimAssessorII.SComment();
//        IntimateClaimAssessorII.Doc();
//        IntimateClaimAssessorII.UDoc();
//        IntimateClaimAssessorII.UpClaimForm();
//        IntimateClaimAssessorII.FUpload();
//        IntimateClaimAssessorII.Doc2();
//        IntimateClaimAssessorII.AttachPg();
//        IntimateClaimAssessorII.DocC();
//        IntimateClaimAssessorII.DPageXpath();
//        IntimateClaimAssessorII.Sbox(SearchB);
//        IntimateClaimAssessorII.Sbtn();
//        IntimateClaimAssessorII.CheckB(); // Always change xpath
//        IntimateClaimAssessorII.DocA(Spec);
//        IntimateClaimAssessorII.APage();
//        IntimateClaimAssessorII.Doc();
//        IntimateClaimAssessorII.UDoc();
//        IntimateClaimAssessorII.UpID();
//        IntimateClaimAssessorII.FUpload();
//        IntimateClaimAssessorII.Doc2();
//        IntimateClaimAssessorII.AttachPg();
//        IntimateClaimAssessorII.DocCA();
//        IntimateClaimAssessorII.DPageXpath();
//        IntimateClaimAssessorII.Sbox(SearchB);
//        IntimateClaimAssessorII.Sbtn();
//        IntimateClaimAssessorII.CheckB();
//        IntimateClaimAssessorII.DocAA(SpecA);
//        IntimateClaimAssessorII.APage();



//ID
//        IntimateClaimAssessorII.MClaims();
//        IntimateClaimAssessorII.NDoc();
//        IntimateClaimAssessorII.DocDetails();
//        IntimateClaimAssessorII.CPolicy();
//        IntimateClaimAssessorII.Req();
//        IntimateClaimAssessorII.DocViewID();
//        //IntimateClaimAssessorII.PageC();
//        IntimateClaimAssessorII.ApProveA();



// Form
//        IntimateClaimAssessorII.MClaims();
//        IntimateClaimAssessorII.NDoc();
//        IntimateClaimAssessorII.DocDetails();
//        IntimateClaimAssessorII.CPolicy();
//        IntimateClaimAssessorII.Req();
//        IntimateClaimAssessorII.LifeClaimFR();
//      //  IntimateClaimAssessorII.PageV();
//        IntimateClaimAssessorII.ApProveA();

//
//        IntimateClaimAssessorII.MClaims();
//       // IntimateClaimAssessorII.NDoc();
//        IntimateClaimAssessorII.temp();
        IntimateClaimAssessorII.DocDetails();// Change xpath always
//
         IntimateClaimAssessorII.CPolicy();
//         IntimateClaimAssessorII.Req();
////
//         IntimateClaimAssessorII.BoxID();
//         IntimateClaimAssessorII.BoxIDComplete();
//         IntimateClaimAssessorII.DeathCC();
//         IntimateClaimAssessorII.NotA();

//        IntimateClaimAssessorII.LifeP();
//        IntimateClaimAssessorII.LifePComplete();
//
//        IntimateClaimAssessorII.IDB();
//        IntimateClaimAssessorII.CID();
//        IntimateClaimAssessorII.DeathC();
//        IntimateClaimAssessorII.NADeathC();

//         IntimateClaimAssessorII.HospitalPolicyCF();
//         IntimateClaimAssessorII.NAHospitalPolicyCF();

//         IntimateClaimAssessorII.ClinicFile();
//         IntimateClaimAssessorII.NAAClinicFile();
//         IntimateClaimAssessorII.HospitalPCF();
//         IntimateClaimAssessorII.NAHospitalPCF();
//        IntimateClaimAssessorII.DCertificate();
//
//        IntimateClaimAssessorII.AffidavitB();
//        IntimateClaimAssessorII.NAAffidavit();
//         IntimateClaimAssessorII.PolicyF();
//        IntimateClaimAssessorII.CComplete();


//        IntimateClaimAssessorII.CoverS();
//        IntimateClaimAssessorII.NACoverS();





//



////Add Ben
//        IntimateClaimAssessorII.CClaims();
//        IntimateClaimAssessorII.AddBen();
//        IntimateClaimAssessorII.AddB();
//        IntimateClaimAssessorII.AddS();
//        IntimateClaimAssessorII.close();
////        IntimateClaimAssessorII.VerBen();


        // This is when the beneciary doesn't have an ID number
//        IntimateClaimAssessorII.VBen();
//        IntimateClaimAssessorII.VerBen();
//         IntimateClaimAssessorII.Act();
//         IntimateClaimAssessorII.BenID();
//         IntimateClaimAssessorII.BenIDInput(BenIDS);
//         IntimateClaimAssessorII.ClickSearch();
//         IntimateClaimAssessorII.NameBen(BenName);
//         IntimateClaimAssessorII.SurBen(BenSur);
//         IntimateClaimAssessorII.BType(Bentittle);
//         IntimateClaimAssessorII.SaveBtn();

//        IntimateClaimAssessorII.MClaims();
//        IntimateClaimAssessorII.NDoc();
//        IntimateClaimAssessorII.DocDetails();
//        IntimateClaimAssessorII.CPolicy();
//        IntimateClaimAssessorII.Per(Percentage);
//        IntimateClaimAssessorII.PerII(PercentageII);
//        IntimateClaimAssessorII.PerIII(PercentageIII);
//           IntimateClaimAssessorII.Act(); // Always change xpath
//        IntimateClaimAssessorII.VerBen();
//        IntimateClaimAssessorII.Act();
//        IntimateClaimAssessorII.ConfirmBAccount();  // Always change xpath
//        IntimateClaimAssessorII.AccType(AccT);
//        IntimateClaimAssessorII.BankN(BankNm);
//        IntimateClaimAssessorII.AccNo(Acc);
//        IntimateClaimAssessorII.BrunchC(BCode);
//        IntimateClaimAssessorII.SSaveB();
//        IntimateClaimAssessorII.Actions();
//        IntimateClaimAssessorII.VAcc();
//        IntimateClaimAssessorII.BurgerI();
//        IntimateClaimAssessorII.Reco();
//       // IntimateClaimAssessorII.WYes();
//        IntimateClaimAssessorII.CommentR(Recco);
//        //IntimateClaimAssessorII.Opt();  //This option doesnt appear all the time
//        IntimateClaimAssessorII.SCommentBtn();
//
      //  IntimateClaimAssessorII.Yes();
//        IntimateClaimAssessorII.BurgerIX();
//        IntimateClaimAssessorII.RecoI();
//        //IntimateClaimAssessorII.WYes();
//        IntimateClaimAssessorII.CommentR(ReccoI);
////        IntimateClaimAssessorII.Opt();   //This option doesnt appear all the time
//        IntimateClaimAssessorII.SCommentBtn();
        //IntimateClaimAssessorII.Yes();

//        IntimateClaimAssessorII.BurgerII();
//        IntimateClaimAssessorII.RecoII();
//       // IntimateClaimAssessorII.Yes();
//        IntimateClaimAssessorII.CommentR(ReccoII);
////    IntimateClaimAssessorII.Opt();   //This option doesnt appear all the time
//        IntimateClaimAssessorII.SCommentBtnII();
//        IntimateClaimAssessorII.RecoIII();
//        IntimateClaimAssessorII.ReCcoIII();
//      //  IntimateClaimAssessorII.Yes();
//        IntimateClaimAssessorII.CommentR(ReccoIII);
//       // IntimateClaimAssessorII.Opt();   //This option doesnt appear all the time
//        IntimateClaimAssessorII.SCommentBtn();

        IntimateClaimAssessorII.BurgerIIII();
        IntimateClaimAssessorII.RecP();
       // IntimateClaimAssessorII.Yes();
        IntimateClaimAssessorII.CommentR(ReccoIIII);
       // IntimateClaimAssessorII.Opt();  //This option doesnt appear all the time
        IntimateClaimAssessorII.SCommentBtn();
    }



}
