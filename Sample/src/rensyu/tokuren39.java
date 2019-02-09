package rensyu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tokuren39 {

    public static void main(String[] args) {
        // データベース接続と結果取得のための変数
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        // JDBCドライバの読み込み
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        // JDBCドライバが見つからない場合、例外
            e.printStackTrace();
        }
        try {
            // DBへの接続を行う
            con = DriverManager.getConnection("jdbc:mysql://localhost/world",
                "root", "password");// "password"の部分は，ご自身でrootユーザーに設定したものを記載してください。
            // DB処理のための準備、Statementオブジェクトの作成
            stmt = con.createStatement();
            // Select文の実行と結果を格納／代入
            rs = stmt.executeQuery("select * from country limit 50");
            // 結果を表示する
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
                System.out.println(rs.getInt("Population"));
            }

            // データの更新を行う
            int count = stmt.executeUpdate("update country set Population = 105000 where Code = 'ABW'");
            System.out.println(count);

        } catch (SQLException e) {
            // DBとの処理で何らかのエラーがあった場合の例外
            e.printStackTrace();

        } finally { // 以降は何があっても接続を切断する
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
