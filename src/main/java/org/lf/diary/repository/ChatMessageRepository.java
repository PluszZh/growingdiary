package org.lf.diary.repository;

import org.lf.diary.model.ChatMessage;
import org.lf.diary.model.RelationShip;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: PengZH
 * @Date: 2020/3/7 19:15
 * @Description:
 */
public interface ChatMessageRepository extends JpaRepository<ChatMessage,Long>, JpaSpecificationExecutor<ChatMessage> {

    /**
     * 获取当前用户所有未读信息条数
     */
    @Query(value = "SELECT COUNT(1) FROM chat_message WHERE  to_user_id = ?1 AND `status` = 0",nativeQuery = true)
    Long countUnread(Long id);

    /**
     * 获取当前用户和对应联系人未读的消息条数
     * example:  查找24号收到来自21号的未读消息条数
     * 传参 24 21
     * */
    @Query(value = "SELECT COUNT(1) FROM chat_message WHERE from_user_id = ?2 AND to_user_id = ?1 AND `status` = 0 ",nativeQuery = true)
    Long countUnreadByOne(Long host,Long contact);

    /**
     * 按时间倒序加载一个月一组关系之间的聊天记录 (减轻数据库压力)
     * findAll()业务层实现
     */


}
