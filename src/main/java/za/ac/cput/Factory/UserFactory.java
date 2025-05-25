package za.ac.cput.Factory;

import za.ac.cput.Domain.user.User;
import za.ac.cput.Util.Helper;

public class UserFactory {
public static User createUser(int UserId, String UserName, String postalCode) {
    if (UserId <= 0) {
        return null;
    }
    if (Helper.isNullOrEmpty(UserName) || Helper.isNullOrEmpty(postalCode)) {
        return null;
    }
    if (Helper.isValidPostalCode(postalCode)) {
        return null;
    }
    return new User.Builder()
            .setUserId(UserId)
            .setUserName(UserName)
            //.setPostalCode(postalCode)
            .build();

}
}
