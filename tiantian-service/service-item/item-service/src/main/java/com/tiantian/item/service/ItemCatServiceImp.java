package com.tiantian.item.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiantian.item.apis.ItemCatService;
import com.tiantian.item.beans.ItemCatResult;
import com.tiantian.item.dao.ItemCatDao;
import com.tiantian.item.pojo.ItemCat;
import com.tiantian.item.vo.ItemCatVo;

@Service("itemCatService")
public class ItemCatServiceImp implements ItemCatService {

	@Autowired
	private ItemCatDao itemCatDao;
	
	@Autowired
	private Mapper dozerMapper;
	@Override
	public List<ItemCatVo> queryItemCatList(Long parentId) {
		List<ItemCat> itemCats = itemCatDao.queryItemCatList(parentId);
		return pojoToVo(itemCats);
	}

	@Override
	public ItemCatResult queryItemCatWebAll() {
		return itemCatDao.queryItemCatWebAll();
	}

	@Override
	public ItemCatVo queryById(long id) {
		ItemCat itemCat=itemCatDao.findById(id);
		return dozerMapper.map(itemCat, ItemCatVo.class);
	}

	/**
	 * pojo转vo对象
	 * @param contentCategorys
	 * @return
	 */
	private List<ItemCatVo>  pojoToVo(List<ItemCat>  itemCats){
		List<ItemCatVo> list=new ArrayList<ItemCatVo>();
		for(ItemCat ic:itemCats){
			ItemCatVo vo=dozerMapper.map(ic, ItemCatVo.class);
			list.add(vo);
		}
		return list;
	}

}
