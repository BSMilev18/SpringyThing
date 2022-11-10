import org.springframework.stereotype.Repository;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
@Repository
public class PlayerDao implements PlayerDao1 {
    private static final class PlayerMapper<Player> implements RowMapper<Player> {

        @Override
        public int[] getRowsForPaths(TreePath[] path) {
            return new int[0];
        }
    }

    @Override
    public <Player> Player mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Player player = new Player();
        player.setId(resultSet.getInt("id"));
        player.setName(resultSet.getString("name"));
        player.setNationality(resultSut.getTime("birth_date"));
        player.setTitle(resultSet.getInt("titles"));
        return player;
    }
}
    public List<Player> getPlayerByNationality(String nationality) {
        String sql = "SELECT * FROM PLAYER WHERE NATIONALITY = ?";
        return jdvcTemplate.query(sql, new PlayerMapper(), new Object[] {nationality});
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("French Players: {}", dao.getPlayerByNationality("France"));
    }
