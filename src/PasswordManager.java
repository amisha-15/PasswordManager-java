import java.sql.*;

public class PasswordManager {

    public static boolean login(String user, String pass) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void add(String website, String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "INSERT INTO passwords(website, username, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, website);
            ps.setString(2, username);
            ps.setString(3, password);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet view() {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM passwords");
            return ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void update(int id, String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE passwords SET username=?, password=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, id);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM passwords WHERE id=?");

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet search(String website) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM passwords WHERE website=?");

            ps.setString(1, website);
            return ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
