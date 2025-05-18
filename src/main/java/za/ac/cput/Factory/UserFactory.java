package za.ac.cput.Factory;

import za.ac.cput.Domain.user.User;

public class UserFactory {
public static User createUser(int UserId, String UserName, String postalCode) {
    if (UserId <= 0) {
        return null;
    }
    if (za.ac.cput.Helper.Helper.isNullOrEmpty(UserName) || za.ac.cput.Helper.Helper.isNullOrEmpty(postalCode)) {
        return null;
    }
    if (!za.ac.cput.Helper.Helper.isValidPostalCode(postalCode)) {
        return null;
    }
    return new User.Builder()
            .setUserId(UserId)
            .setUserName(UserName)
            //.setPostalCode(postalCode)
            .build();

}
}
