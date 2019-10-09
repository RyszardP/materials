package com.ryszardp.repository.jdbc.impl;

import com.ryszardp.domain.materials.Chipboard;
import com.ryszardp.repository.jdbc.ChipboardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class ChipboardDaoImpl implements ChipboardDao {

    public static final String MATERIAL_ID = "material_id";
    public static final String MATERIAL_ARTICLE = "material_article";
    public static final String MATERIAL_NAME = "material_name";
    public static final String GROUP_NUMBER = "group_number";
    public static final String GROUP_NAME = "group_name";
    public static final String UNIT = "unit";
    public static final String COST = "cost";
    public static final String COEFFICIENT = "coefficient";
    public static final String LENGTH = "length";
    public static final String WIDTH = "width";
    public static final String THICKNESS = "thickness";
    public static final String DESIGNATION = "designation";
    public static final String OVERHANG = "overhang";
    public static final String COLOR = "color";
    public static final String TEXTURE = "texture";
    public static final String MATERIAL_CLASS = "material_class";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private Chipboard getChipboardRowMapper(ResultSet resultSet, int i) throws SQLException {
        Chipboard chipboard= new Chipboard();
        chipboard.setMaterialId(resultSet.getLong(MATERIAL_ID));
        chipboard.setMaterialArticle(resultSet.getString(MATERIAL_ARTICLE));
        chipboard.setMaterialName(resultSet.getString(MATERIAL_NAME));
        chipboard.setGroupName(resultSet.getString(GROUP_NUMBER));
        chipboard.setGroupNumber(resultSet.getString(GROUP_NAME));
        chipboard.setUnit(resultSet.getString(UNIT));
        chipboard.setCost(resultSet.getString(COST));
        chipboard.setCoefficient(resultSet.getString(COEFFICIENT));
        chipboard.setLength(resultSet.getLong(LENGTH));
        chipboard.setWidth(resultSet.getLong(WIDTH));
        chipboard.setThickness(resultSet.getLong(THICKNESS));
        chipboard.setDesignation(resultSet.getString(DESIGNATION));
        chipboard.setOverhang(resultSet.getLong(OVERHANG));
        chipboard.setColor(resultSet.getString(COLOR));
        chipboard.setTexture(resultSet.getString(TEXTURE));
        chipboard.setMaterialClass(resultSet.getString(MATERIAL_CLASS));
        return chipboard;
    }

    @Override
    public List<Chipboard> findAll() {
        final String findAllQuery = "select * from chipboard";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getChipboardRowMapper);

    }

    @Override
    public Chipboard findById(Long id) {
        final String findById = "select * from chipboard where chipboard_id =:chipboardId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("chipboardId",id);
        return  namedParameterJdbcTemplate.queryForObject(findById, params, this::getChipboardRowMapper);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Chipboard save(Chipboard entity) {
        return null;
    }

    @Override
    public Chipboard update(Chipboard entity) {
        return null;
    }
}
