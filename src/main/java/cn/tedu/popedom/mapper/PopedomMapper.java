package cn.tedu.popedom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.popedom.pojo.Popedom;
import cn.tedu.popedom.pojo.RolePopedom;

public interface PopedomMapper {

	List<RolePopedom> selectAll();

	List<Popedom> selectPopedomList();

	int addRolePopedom(RolePopedom rolePopedom);

	List<RolePopedom> getRolePope(String roleName);

	Popedom selectPopedom(String popedomName);

	String getRoleName(Integer roleId);

	int deleteRolePopedom(@Param("roleName")String roleName,@Param("popedomName")String popedomName);

	List<RolePopedom> getRolePopedom(@Param("roleName")String roleName,@Param("popedomId")String popedomId);

}
