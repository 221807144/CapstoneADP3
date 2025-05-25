/*Emihle Thole
  221755349
  18/05/18*/

package za.ac.cput.Factory.licence;

import za.ac.cput.Domain.licence.License;
import za.ac.cput.Domain.user.User;
import za.ac.cput.Util.Helper;

public class LicenseFactory {

    public static License createLicense(String licenseType, String issueDate, String expiryDate, User user) {
        int licenseId = Helper.generateUniqueId();

        if (Helper.isNullOrEmpty(licenseType) || Helper.isNullOrEmpty(issueDate) || Helper.isNullOrEmpty(expiryDate)|| user == null)
            return null;


        return new License.Builder()
                .setLicenseId(licenseId)
                .setLicenseType(licenseType)
                .setIssueDate(issueDate)
                .setExpiryDate(expiryDate)
                .setUser(user)
                .build();
}}
