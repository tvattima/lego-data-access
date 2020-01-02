package net.bricklink.data.lego.ibatis.mapper;

import net.bricklink.data.lego.dto.BricklinkItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface BrinklinkItemMapper {
    @Select("SELECT item_id, bl_item_id, bl_item_number FROM bricklink_item WHERE item_id = #{itemId}")
    BricklinkItem getBricklinkItemForItemId(int itemId);

    @Select("SELECT item_id, bl_item_id, bl_item_number FROM bricklink_item WHERE bl_item_number = #{blItemNumber}")
    Optional<BricklinkItem> getBricklinkItemForBricklinkItemNumber(String blItemNumber);
}
