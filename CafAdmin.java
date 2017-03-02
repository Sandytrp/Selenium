package com.caf.Cafscripts;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.caf.genericLib.BaseLib;
import com.caf.genericLib.ExcelLib;

import com.caf.genericLib.WaitLib;
import com.caf.pom.Acquired_RetainedDonorsPage;
import com.caf.pom.CAFDashboardPage;
import com.caf.pom.CAFLandingPage;
import com.caf.pom.CausesPage;
import com.caf.pom.CorporateDocumentPage;
import com.caf.pom.CorporateValidationPage;
import com.caf.pom.CorporateWriteUpApproval;
import com.caf.pom.DonorNGOReport;
import com.caf.pom.LoginPage;
import com.caf.pom.MOUReportPage;
import com.caf.pom.Manage80GReport;
import com.caf.pom.ManageCampignPage;
import com.caf.pom.ManageNGOsPage;
import com.caf.pom.NGOCauseApprovalPage;
import com.caf.pom.NGODocumentValidationPage;
import com.caf.pom.NGODonationReportPage;
import com.caf.pom.NGODonorReportPage;
import com.caf.pom.NGOValidationPage;
import com.caf.pom.NGOWriteUpApproval;
import com.caf.pom.Subscribe;
import com.caf.pom.TransactionReportPage;

public class CafAdmin extends BaseLib {
	WaitLib wl = new WaitLib();

	@Test(priority = 1, enabled = false)
	public void DifferenceYouMade() {

		try {
			String status = ExcelLib.readExcelData("Sheet3", 1, 3);
			if (status.equalsIgnoreCase("N")) {
				System.out.println("CafAdmin.DifferenceYouMade()");
				throw new SkipException("");
			} else {

			}
			CAFDashboardPage cafdash = new CAFDashboardPage(driver);
			CAFLandingPage caflanding = new CAFLandingPage(driver);
			LoginPage lp = new LoginPage(driver);

			lp.cafAdminlogin();
			cafdash.ManageLanding();
			wl.ImplicitWait(driver, 20);
			caflanding.diffwriteup();
			wl.ImplicitWait(driver, 40);
			caflanding.WriteupUpdate();
			caflanding.sucessmsg();
			Reporter.log("ID1 successfully completed.", true);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test(priority = 2, enabled = false)
	public void AddStoriesofHope() {
		try {
			String status = ExcelLib.readExcelData("Sheet3", 1, 3);
			if (status.equalsIgnoreCase("N")) {
				System.out.println("CafAdmin.DifferenceYouMade()");
				throw new SkipException("");
			} else {

			}
			CAFDashboardPage cafdash = new CAFDashboardPage(driver);
			CAFLandingPage caflanding = new CAFLandingPage(driver);
			LoginPage lp = new LoginPage(driver);
			lp.cafAdminlogin();
			cafdash.ManageLanding();
			caflanding.StoriesofHope();

			caflanding.createstory();
			caflanding.Storysucessmsg();
			Reporter.log("ID2 successfully completed", true);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test(priority = 3, enabled = false)
	public void UpdateStoriesofHope() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CAFLandingPage caflanding = new CAFLandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		try {
			lp.cafAdminlogin();
			cafdash.ManageLanding();
			caflanding.StoriesofHope();
			caflanding.updatestory();
			caflanding.Storysucessmsg();
			Reporter.log("ID3 successfully completed", true);
			driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 4, enabled = false)
	public void DeleteStoriesofHope() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CAFLandingPage caflanding = new CAFLandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		try {
			lp.cafAdminlogin();
			cafdash.ManageLanding();
			caflanding.StoriesofHope();
			caflanding.deleteStory();
			caflanding.Storysucessmsg();
			Reporter.log("ID4 successfully completed", true);
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5, enabled = false)
	public void addTestimonial() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CAFLandingPage caflanding = new CAFLandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		try {
			lp.cafAdminlogin();
			cafdash.ManageLanding();
			caflanding.testimonial();
			caflanding.createTestimonial();
			caflanding.Testimonialsucessmsg();
			Reporter.log("ID5 successfully completed", true);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6, enabled = false)
	public void updateTestimonial() throws InterruptedException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CAFLandingPage caflanding = new CAFLandingPage(driver);
		LoginPage lp = new LoginPage(driver);

		lp.cafAdminlogin();
		cafdash.ManageLanding();
		caflanding.testimonial();
		caflanding.updateTestimonial();
		caflanding.Testimonialsucessmsg();
		Reporter.log("ID6 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 8, enabled = false)
	public void deleteTestimonial() throws InterruptedException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CAFLandingPage caflanding = new CAFLandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();

		cafdash.ManageLanding();
		caflanding.testimonial();
		caflanding.deleteTestimonial();
		caflanding.Testimonialsucessmsg();

		Reporter.log("ID8 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 9, enabled = false)
	public void manageCauses() throws InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageCauses();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Causes", title);
		Reporter.log("ID9 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 10, enabled = false)
	public void AddCauseWithoutPromotionalReport() throws InterruptedException, AWTException, IOException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CausesPage cafCauses = new CausesPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageCauses();
		cafCauses.addCausewithoutPromotional();
		String title = driver.getTitle();
		Assert.assertEquals("Causes", title);
		Reporter.log("ID10 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 11, enabled = false)
	public void AddCauseWithPromotionalReport() throws InterruptedException, IOException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CausesPage cafCauses = new CausesPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageCauses();
		cafCauses.addCausewithPromotional();
		String title = driver.getTitle();
		Assert.assertEquals("Causes", title);
		Reporter.log("ID11 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 12, enabled = false)
	public void EditCause() throws InterruptedException, IOException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CausesPage cafCauses = new CausesPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageCauses();
		cafCauses.editCausewithoutPromotional();
		Reporter.log("ID12 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 13, enabled = false)
	public void DeleteCause() throws AWTException, InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();

		cafdash.ManageCauses();

		CausesPage cafCauses = new CausesPage(driver);
		cafCauses.deleteCause();
		Reporter.log("ID13 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 14, enabled = false)
	public void manageCampaign() throws InterruptedException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();

		cafdash.ManageCampaign();
		String title = driver.getTitle();
		Assert.assertEquals("Manage Campaign", title);
		Reporter.log("ID14 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 15, enabled = false)

	public void addCampaign() throws InterruptedException, IOException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();

		ManageCampignPage cafCampaign = new ManageCampignPage(driver);
		cafdash.ManageCampaign();
		cafCampaign.addCampaign();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Campaign", title);
		Reporter.log("ID15 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 16, enabled = false)
	public void editCampaign() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		ManageCampignPage cafCampaign = new ManageCampignPage(driver);
		cafdash.ManageCampaign();
		try {
			cafCampaign.editCampaign();
			Thread.sleep(4000);
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Manage Campaign", title);
			Reporter.log("ID16 successfully completed", true);
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17, enabled = false)
	public void DeactivateCampaign() throws InterruptedException, AWTException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();

		ManageCampignPage cafCampaign = new ManageCampignPage(driver);
		cafdash.ManageCampaign();
		cafCampaign.deactivateCampaign();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Campaign", title);
		Reporter.log("ID17 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 27, enabled = false)
	public void viewValidationPlanofNgo() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		ManageNGOsPage cafNgo = new ManageNGOsPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageNGO();
		cafNgo.validations();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Validation Plan", title, "Validation page not displayed");
		Reporter.log("ID27 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 28, enabled = false)
	public void viewSubscriptionPlanofNgo() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		ManageNGOsPage cafNgo = new ManageNGOsPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageNGO();
		cafNgo.subscription();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Subscribe", title, "Validation page not displayed");
		Reporter.log("ID28 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 29, enabled = false)
	public void deactivateNgo() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		ManageNGOsPage cafNgo = new ManageNGOsPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.ManageNGO();
		try {
			cafNgo.deactivate();
			Thread.sleep(1000);
			String Successmsg = driver.findElement(By.xpath(".//div[@id='responseMsg']")).getText();
			System.out.println(Successmsg);
			Assert.assertEquals("NGO is Deactivated Successfully.", Successmsg, "NGO is not Deactivated");
			Reporter.log("ID29 successfully completed", true);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30, enabled = false)
	public void approveNgo() throws InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		NGOValidationPage cafNGoReg = new NGOValidationPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.RegistrationNGO();
		Thread.sleep(1000);
	    String URL=driver.getCurrentUrl();
	    cafNGoReg.ngoDocumentsApprove();
	    driver.navigate().to(URL);
		cafNGoReg.ngoValidate();
		String SuccessMsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(SuccessMsg);
		Reporter.log("ID30 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 31, enabled = false)
	public void transactionDetailsofNgo() {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		NGOValidationPage cafNGoReg = new NGOValidationPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.RegistrationNGO();
		cafNGoReg.ngoTransactionHistory();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Transaction History", title, "Transaction History page not displayed");
		Reporter.log("ID31 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 32, enabled = false)
	public void approveCorporate() throws InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CorporateValidationPage cafCorporateReg = new CorporateValidationPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.RegistrationCorporate();
		cafCorporateReg.corporateValidate();
		String successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(successmsg);
		Assert.assertEquals("Corporate approved successfully", successmsg, "Corporate admin is not Approved");
		Reporter.log("ID32 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 34, enabled = false)
	public void ApproveDocumentsofNGO() throws InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		NGODocumentValidationPage cafNGODocument = new NGODocumentValidationPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.DocumentsNGOs();
		cafNGODocument.approveDocument();
		String successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(successmsg);
		Assert.assertEquals("Ngo documents approved successfully", successmsg, "NGO Document is not Approved");
		Reporter.log("ID34 successfully completed", true);

	}

	@Test(priority = 36, enabled = false)
	public void ApproveDocumentsofCorporate() throws InterruptedException {
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		CorporateDocumentPage cafCorporateDocument = new CorporateDocumentPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.DocumentsCorporate();
		cafCorporateDocument.approveDocument();
		String successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(successmsg);
		Assert.assertEquals("Corporate documents approved successfully", successmsg,
				"Corporate Document is not Approved");
		Reporter.log("ID36 successfully completed", true);

	}

	@Test(priority = 38, enabled = false)
	public void ApproveLandingpagesofNGO() throws InterruptedException {
		NGOWriteUpApproval cafWriteupNgo = new NGOWriteUpApproval(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.PageApprovalNGO();
		cafWriteupNgo.approveNGOLandingPage();
		String successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(successmsg);
		Assert.assertEquals("Ngo approved successfully", successmsg, "NGO Writeup is not approved");
		Reporter.log("ID38 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 40, enabled = false)
	public void ApproveLandingpagesofCorporate() throws InterruptedException {
		CorporateWriteUpApproval cafWriteupCorporate = new CorporateWriteUpApproval(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.PageApprovalCorporate();
		cafWriteupCorporate.approveCorporateLandingPage();
		String successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(successmsg);
		Assert.assertEquals("Corporate approved successfully", successmsg, "Corporate Writeup is not approved");
		Reporter.log("ID40 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 41, enabled = false)
	public void ApproveSubscriptionPlan() throws InterruptedException {
		Subscribe Sub = new Subscribe(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.NGOsSubscription();
		Sub.approveSubscribe();
		String Successmsg = driver.findElement(By.id("responseMsg")).getText();
		System.out.println(Successmsg);
		Assert.assertEquals("Ngo Subscription approved successfully", Successmsg, "Subscription is not approved");
		Reporter.log("ID41 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 43, enabled = false)
	public void ApproveCauseMapping() throws InterruptedException {
		NGOCauseApprovalPage cafNGOCause = new NGOCauseApprovalPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		wl.ImplicitWait(driver, 20);
		cafdash.NGOsCausesMapping();
		cafNGOCause.approveCauseApproval();
		String Successmsg = driver.findElement(By.id("responseMessage")).getText();
		System.out.println(Successmsg);
		Assert.assertEquals("The request is successfully approved.", Successmsg, "Subscription is not approved");
		Reporter.log("ID43 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 45, enabled = false)
	public void NGO_CauseMapping() throws InterruptedException {
		com.caf.pom.NGO_CauseMapping cafNGO_cause = new com.caf.pom.NGO_CauseMapping(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.CorporateNGO_CausesMapping();
		Thread.sleep(2000);
		cafNGO_cause.approveNGO_CauseApproval();
		wl.ImplicitWait(driver, 50);
		String Successmsg = driver.findElement(By.id("responseMessage")).getText();
		System.out.println(Successmsg);
		Assert.assertEquals("The request is successfully approved.", Successmsg, "Request is not approved");
		Reporter.log("ID45 successfully completed", true);
		driver.quit();

	}

	@Test(priority = 46, enabled = false)
	public void View80GReport() throws InterruptedException {
		Manage80GReport caf80G = new Manage80GReport(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.Report_80G();
		caf80G.report80G();

		Reporter.log("ID46 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 49, enabled = false)
	public void View80GReportShortlistColumn() throws InterruptedException {
		NGODonationReportPage cafNGoReport = new NGODonationReportPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.NgoDonationDetails();
		cafNGoReport.GenerateReport();
		Reporter.log("ID49 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 52, enabled = false)
	public void Donor_NGOReport() throws InterruptedException {
		DonorNGOReport cafDonorNGO = new DonorNGOReport(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.Donor_NGOWiseDetail();
		cafDonorNGO.generateReport();
		Reporter.log("ID52 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 55, enabled = false)
	public void NGO_DonorReport() throws InterruptedException {
		NGODonorReportPage cafNGODonor = new NGODonorReportPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.NGO_DonorWiseDetails();
		cafNGODonor.generateReport();
		Reporter.log("ID55 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 58, enabled = false)
	public void

			Acquired_RetainedDonorsReport() throws InterruptedException {
		Acquired_RetainedDonorsPage cafacqired = new Acquired_RetainedDonorsPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.Acquired_RetainedDonors();
		cafacqired.generateReport();
		Reporter.log("ID58 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 61, enabled = false)
	public void MOUReport() throws InterruptedException {
		MOUReportPage cafMOU = new MOUReportPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.MOUReport();
		cafMOU.generateReport();
		Reporter.log("ID61 successfully completed", true);
		driver.quit();
	}

	@Test(priority = 64, enabled = false)
	public void TransactionReport() throws InterruptedException {
		TransactionReportPage caftransaction = new TransactionReportPage(driver);
		CAFDashboardPage cafdash = new CAFDashboardPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.cafAdminlogin();
		cafdash.TransactionHistory();
		caftransaction.generateReport();
		Reporter.log("ID64 successfully completed", true);
		driver.quit();
	}
	
	
}
