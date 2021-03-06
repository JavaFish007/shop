
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title" id="myModalLabel">
				<#if catalogProperty.id == -1>
					添加分类
				<#else>
					修改分类
				</#if>
			</h4>
		</div>
		<form action="/addCatalogProperty.do" method="post" id="catalogPropertyForm">
			<div class="modal-body">
				<input type="hidden" name="catalogId" id="catalogId" value="${catalogProperty.catalogId}"/>
				<#if catalogProperty.id != -1>
					<input type="hidden" name="id" value="${catalogProperty.id}"/>
				</#if>
		
				<div class="form-group">
					<label for="exampleInputEmail1">分类属性名</label> <input
						class="form-control" name="name" value="${catalogProperty.name!''}"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">分类属性类型</label>
					<select name="type">
							<option value="0" 
								<#if catalogProperty.type?? && catalogProperty.type == 0>
									selected="selected"
								</#if>
							>输入框</option>
							<option value="1"
								<#if catalogProperty.type?? && catalogProperty.type == 1>
									selected="selected"
								</#if>
							>多选框</option>
							<option value="2"
								<#if catalogProperty.type?? && catalogProperty.type == 2>
									selected="selected"
								</#if>
							>下拉列表</option>
					</select>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default"
						data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="saveCatalogProperty()">保存</button>
				</div>
			</div>
		</form>
