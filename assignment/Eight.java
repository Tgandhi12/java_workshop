public class Eight {
    public static void main(String[] args) {
        long id = 101L;
        String sql = """
                SELECT id, name
                FROM users
                WHERE id = %d
                AND status = 'ACTIVE'
                ORDER BY name ASC;
                """;
        String finalQuery = sql.formatted(id);
        System.out.println(finalQuery);
    }
}
