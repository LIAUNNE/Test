	function nishuo(id) {
				if(id == 1) {
					$('#chexin').collapse('toggle'); //切换
					$('#gouche').collapse('hide'); //隐藏
					$('#kehu').collapse('hide');
					//	$('#kehu').collapse('show');    //显示
				} else if(id == 2) {
					$('#gouche').collapse('toggle');
					$('#chexin').collapse('hide');
					$('#kehu').collapse('hide');
				} else if(id == 3) {
					$('#kehu').collapse('toggle');
					$('#chexin').collapse('hide');
					$('#gouche').collapse('hide');
				} else if(id == 4) {
					$('#jiaoche').collapse('show');
					$('#SUV').collapse('hide');
					$('#paoche').collapse('hide');
				} else if(id == 5) {
					$('#jiaoche').collapse('hide');
					$('#SUV').collapse('show');
					$('#paoche').collapse('hide');
				} else if(id == 6) {
					$('#jiaoche').collapse('hide');
					$('#SUV').collapse('hide');
					$('#paoche').collapse('show');;
				}
			}
function weishenme(info_model){
	sessionStorage.setItem('info_model', JSON.stringify(info_model));
	window.location.href = "carInfo.html";
}
