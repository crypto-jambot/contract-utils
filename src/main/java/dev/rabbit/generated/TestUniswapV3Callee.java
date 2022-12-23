package dev.rabbit.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class TestUniswapV3Callee extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506111ad806100206000396000f3fe608060405234801561001057600080fd5b50600436106100a95760003560e01c8063bac7bf7811610071578063bac7bf78146101f8578063d348799714610234578063e2be9109146102b0578063e9cbafb0146102ec578063f603482c14610368578063fa461e33146103a4576100a9565b8063034b0f8f146100ae5780632ec20bf9146100f85780636dfc0ddb146101305780637b4f53271461016c5780639e77b805146101c0575b600080fd5b6100f6600480360360c08110156100c457600080fd5b506001600160a01b03813581169160208101359091169060408101359060608101359060808101359060a00135610420565b005b6100f66004803603606081101561010e57600080fd5b506001600160a01b038135811691602081013582169160409091013516610541565b6100f66004803603608081101561014657600080fd5b506001600160a01b0381358116916020810135916040820135811691606001351661067d565b6100f6600480360360a081101561018257600080fd5b5080356001600160a01b03908116916020810135909116906040810135600290810b91606081013590910b90608001356001600160801b03166107bb565b6100f6600480360360608110156101d657600080fd5b506001600160a01b0381358116916020810135821691604090910135166108f5565b6100f66004803603608081101561020e57600080fd5b506001600160a01b038135811691602081013591604082013581169160600135166109b0565b6100f66004803603606081101561024a57600080fd5b81359160208101359181019060608101604082013564010000000081111561027157600080fd5b82018360208201111561028357600080fd5b803590602001918460018302840111640100000000831117156102a557600080fd5b509092509050610a6f565b6100f6600480360360808110156102c657600080fd5b506001600160a01b03813581169160208101359160408201358116916060013516610ca9565b6100f66004803603606081101561030257600080fd5b81359160208101359181019060608101604082013564010000000081111561032957600080fd5b82018360208201111561033b57600080fd5b8035906020019184600183028401116401000000008311171561035d57600080fd5b509092509050610cc4565b6100f66004803603608081101561037e57600080fd5b506001600160a01b03813581169160208101359160408201358116916060013516610f19565b6100f6600480360360608110156103ba57600080fd5b8135916020810135918101906060810160408201356401000000008111156103e157600080fd5b8201836020820111156103f357600080fd5b8035906020019184600183028401116401000000008311171561041557600080fd5b509092509050610f34565b856001600160a01b031663490e6cbc86868633878760405160200180846001600160a01b0316815260200183815260200182815260200193505050506040516020818303038152906040526040518563ffffffff1660e01b815260040180856001600160a01b0316815260200184815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b838110156104d25781810151838201526020016104ba565b50505050905090810190601f1680156104ff5780820380516001836020036101000a031916815260200191505b5095505050505050600060405180830381600087803b15801561052157600080fd5b505af1158015610535573d6000803e3d6000fd5b50505050505050505050565b826001600160a01b031663128acb088260016001600160ff1b03863360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b838110156105fd5781810151838201526020016105e5565b50505050905090810190601f16801561062a5780820380516001836020036101000a031916815260200191505b5096505050505050506040805180830381600087803b15801561064c57600080fd5b505af1158015610660573d6000803e3d6000fd5b505050506040513d604081101561067657600080fd5b5050505050565b836001600160a01b031663128acb0883600161069887611161565b853360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561073a578181015183820152602001610722565b50505050905090810190601f1680156107675780820380516001836020036101000a031916815260200191505b5096505050505050506040805180830381600087803b15801561078957600080fd5b505af115801561079d573d6000803e3d6000fd5b505050506040513d60408110156107b357600080fd5b505050505050565b846001600160a01b0316633c8a7d8d858585853360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018560020b81526020018460020b8152602001836001600160801b0316815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561087357818101518382015260200161085b565b50505050905090810190601f1680156108a05780820380516001836020036101000a031916815260200191505b5096505050505050506040805180830381600087803b1580156108c257600080fd5b505af11580156108d6573d6000803e3d6000fd5b505050506040513d60408110156108ec57600080fd5b50505050505050565b826001600160a01b031663128acb088260006001600160ff1b03863360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b031681526020018060200182810382528381815181526020019150805190602001908083836000838110156105fd5781810151838201526020016105e5565b836001600160a01b031663128acb088360016109cb87611161565b600003853360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360008381101561073a578181015183820152602001610722565b600082826020811015610a8157600080fd5b506040805187815260208101879052815192356001600160a01b031693507fa0968be00566083701c9ef671c169d7fb05ac8907de4ca17185de74ccbb694d4929081900390910190a18415610bbb57336001600160a01b0316630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b158015610b0957600080fd5b505afa158015610b1d573d6000803e3d6000fd5b505050506040513d6020811015610b3357600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201899052915191909216916323b872dd9160648083019260209291908290030181600087803b158015610b8e57600080fd5b505af1158015610ba2573d6000803e3d6000fd5b505050506040513d6020811015610bb857600080fd5b50505b831561067657336001600160a01b031663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b158015610bfa57600080fd5b505afa158015610c0e573d6000803e3d6000fd5b505050506040513d6020811015610c2457600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201889052915191909216916323b872dd9160648083019260209291908290030181600087803b158015610c7f57600080fd5b505af1158015610c93573d6000803e3d6000fd5b505050506040513d60208110156108ec57600080fd5b836001600160a01b031663128acb0883600061069887611161565b604080518581526020810185905281517f2b0391b4fa408cfe47abd1977d72985695b2e5ebd3175f55be25f2c68c5df21b929181900390910190a1600080600084846060811015610d1457600080fd5b506001600160a01b038135169350602081013592506040013590508115610e2057336001600160a01b0316630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b158015610d6e57600080fd5b505afa158015610d82573d6000803e3d6000fd5b505050506040513d6020811015610d9857600080fd5b5051604080516323b872dd60e01b81526001600160a01b03868116600483015233602483015260448201869052915191909216916323b872dd9160648083019260209291908290030181600087803b158015610df357600080fd5b505af1158015610e07573d6000803e3d6000fd5b505050506040513d6020811015610e1d57600080fd5b50505b80156108ec57336001600160a01b031663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b158015610e5f57600080fd5b505afa158015610e73573d6000803e3d6000fd5b505050506040513d6020811015610e8957600080fd5b5051604080516323b872dd60e01b81526001600160a01b03868116600483015233602483015260448201859052915191909216916323b872dd9160648083019260209291908290030181600087803b158015610ee457600080fd5b505af1158015610ef8573d6000803e3d6000fd5b505050506040513d6020811015610f0e57600080fd5b505050505050505050565b836001600160a01b031663128acb088360006109cb87611161565b600082826020811015610f4657600080fd5b506040805187815260208101879052815192356001600160a01b031693507fd48241df4a75e663b29e55f9506b31f77ed0f48cfe7e7612d1163144995dc1ca929081900390910190a1600085131561108857336001600160a01b0316630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b158015610fd157600080fd5b505afa158015610fe5573d6000803e3d6000fd5b505050506040513d6020811015610ffb57600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201899052915191909216916323b872dd9160648083019260209291908290030181600087803b15801561105657600080fd5b505af115801561106a573d6000803e3d6000fd5b505050506040513d602081101561108057600080fd5b506106769050565b600084131561114f57336001600160a01b031663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b1580156110ca57600080fd5b505afa1580156110de573d6000803e3d6000fd5b505050506040513d60208110156110f457600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201889052915191909216916323b872dd9160648083019260209291908290030181600087803b15801561105657600080fd5b8415801561115b575083155b61067657fe5b6000600160ff1b821061117357600080fd5b509056fea2646970667358221220ac71ad62fc705e1b73ea0b0af954cd11b128f2047dd6bba00d105ec89eebbf4764736f6c63430007060033";

    public static final String FUNC_FLASH = "flash";

    public static final String FUNC_MINT = "mint";

    public static final String FUNC_SWAP0FOREXACT1 = "swap0ForExact1";

    public static final String FUNC_SWAP1FOREXACT0 = "swap1ForExact0";

    public static final String FUNC_SWAPEXACT0FOR1 = "swapExact0For1";

    public static final String FUNC_SWAPEXACT1FOR0 = "swapExact1For0";

    public static final String FUNC_SWAPTOHIGHERSQRTPRICE = "swapToHigherSqrtPrice";

    public static final String FUNC_SWAPTOLOWERSQRTPRICE = "swapToLowerSqrtPrice";

    public static final String FUNC_UNISWAPV3FLASHCALLBACK = "uniswapV3FlashCallback";

    public static final String FUNC_UNISWAPV3MINTCALLBACK = "uniswapV3MintCallback";

    public static final String FUNC_UNISWAPV3SWAPCALLBACK = "uniswapV3SwapCallback";

    public static final Event FLASHCALLBACK_EVENT = new Event("FlashCallback", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event MINTCALLBACK_EVENT = new Event("MintCallback", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event SWAPCALLBACK_EVENT = new Event("SwapCallback", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}, new TypeReference<Int256>() {}));
    ;

    @Deprecated
    protected TestUniswapV3Callee(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TestUniswapV3Callee(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TestUniswapV3Callee(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TestUniswapV3Callee(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<FlashCallbackEventResponse> getFlashCallbackEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(FLASHCALLBACK_EVENT, transactionReceipt);
        ArrayList<FlashCallbackEventResponse> responses = new ArrayList<FlashCallbackEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FlashCallbackEventResponse typedResponse = new FlashCallbackEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.fee0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.fee1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<FlashCallbackEventResponse> flashCallbackEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, FlashCallbackEventResponse>() {
            @Override
            public FlashCallbackEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(FLASHCALLBACK_EVENT, log);
                FlashCallbackEventResponse typedResponse = new FlashCallbackEventResponse();
                typedResponse.log = log;
                typedResponse.fee0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.fee1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<FlashCallbackEventResponse> flashCallbackEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(FLASHCALLBACK_EVENT));
        return flashCallbackEventFlowable(filter);
    }

    public static List<MintCallbackEventResponse> getMintCallbackEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(MINTCALLBACK_EVENT, transactionReceipt);
        ArrayList<MintCallbackEventResponse> responses = new ArrayList<MintCallbackEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MintCallbackEventResponse typedResponse = new MintCallbackEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.amount0Owed = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount1Owed = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<MintCallbackEventResponse> mintCallbackEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, MintCallbackEventResponse>() {
            @Override
            public MintCallbackEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(MINTCALLBACK_EVENT, log);
                MintCallbackEventResponse typedResponse = new MintCallbackEventResponse();
                typedResponse.log = log;
                typedResponse.amount0Owed = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount1Owed = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<MintCallbackEventResponse> mintCallbackEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(MINTCALLBACK_EVENT));
        return mintCallbackEventFlowable(filter);
    }

    public static List<SwapCallbackEventResponse> getSwapCallbackEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(SWAPCALLBACK_EVENT, transactionReceipt);
        ArrayList<SwapCallbackEventResponse> responses = new ArrayList<SwapCallbackEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SwapCallbackEventResponse typedResponse = new SwapCallbackEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.amount0Delta = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount1Delta = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<SwapCallbackEventResponse> swapCallbackEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, SwapCallbackEventResponse>() {
            @Override
            public SwapCallbackEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SWAPCALLBACK_EVENT, log);
                SwapCallbackEventResponse typedResponse = new SwapCallbackEventResponse();
                typedResponse.log = log;
                typedResponse.amount0Delta = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount1Delta = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<SwapCallbackEventResponse> swapCallbackEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SWAPCALLBACK_EVENT));
        return swapCallbackEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> flash(String pool, String recipient, BigInteger amount0, BigInteger amount1, BigInteger pay0, BigInteger pay1) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_FLASH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(amount0), 
                new org.web3j.abi.datatypes.generated.Uint256(amount1), 
                new org.web3j.abi.datatypes.generated.Uint256(pay0), 
                new org.web3j.abi.datatypes.generated.Uint256(pay1)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> mint(String pool, String recipient, BigInteger tickLower, BigInteger tickUpper, BigInteger amount) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_MINT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper), 
                new org.web3j.abi.datatypes.generated.Uint128(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swap0ForExact1(String pool, BigInteger amount1Out, String recipient, BigInteger sqrtPriceLimitX96) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAP0FOREXACT1, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint256(amount1Out), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swap1ForExact0(String pool, BigInteger amount0Out, String recipient, BigInteger sqrtPriceLimitX96) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAP1FOREXACT0, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint256(amount0Out), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExact0For1(String pool, BigInteger amount0In, String recipient, BigInteger sqrtPriceLimitX96) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAPEXACT0FOR1, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint256(amount0In), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExact1For0(String pool, BigInteger amount1In, String recipient, BigInteger sqrtPriceLimitX96) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAPEXACT1FOR0, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint256(amount1In), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapToHigherSqrtPrice(String pool, BigInteger sqrtPriceX96, String recipient) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAPTOHIGHERSQRTPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceX96), 
                new org.web3j.abi.datatypes.Address(160, recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapToLowerSqrtPrice(String pool, BigInteger sqrtPriceX96, String recipient) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SWAPTOLOWERSQRTPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceX96), 
                new org.web3j.abi.datatypes.Address(160, recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3FlashCallback(BigInteger fee0, BigInteger fee1, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_UNISWAPV3FLASHCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(fee0), 
                new org.web3j.abi.datatypes.generated.Uint256(fee1), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3MintCallback(BigInteger amount0Owed, BigInteger amount1Owed, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_UNISWAPV3MINTCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amount0Owed), 
                new org.web3j.abi.datatypes.generated.Uint256(amount1Owed), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3SwapCallback(BigInteger amount0Delta, BigInteger amount1Delta, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_UNISWAPV3SWAPCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(amount0Delta), 
                new org.web3j.abi.datatypes.generated.Int256(amount1Delta), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static TestUniswapV3Callee load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestUniswapV3Callee(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TestUniswapV3Callee load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestUniswapV3Callee(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TestUniswapV3Callee load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TestUniswapV3Callee(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TestUniswapV3Callee load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TestUniswapV3Callee(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TestUniswapV3Callee> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestUniswapV3Callee.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestUniswapV3Callee> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestUniswapV3Callee.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TestUniswapV3Callee> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestUniswapV3Callee.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestUniswapV3Callee> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestUniswapV3Callee.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class FlashCallbackEventResponse extends BaseEventResponse {
        public BigInteger fee0;

        public BigInteger fee1;
    }

    public static class MintCallbackEventResponse extends BaseEventResponse {
        public BigInteger amount0Owed;

        public BigInteger amount1Owed;
    }

    public static class SwapCallbackEventResponse extends BaseEventResponse {
        public BigInteger amount0Delta;

        public BigInteger amount1Delta;
    }
}
